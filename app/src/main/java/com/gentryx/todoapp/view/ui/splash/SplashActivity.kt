package com.gentryx.todoapp.view.ui.splash

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gentryx.todoapp.R
import com.gentryx.todoapp.model.local.AppPreferences
import com.gentryx.todoapp.util.GeneralHelper
import com.gentryx.todoapp.util.NetworkHelper
import com.gentryx.todoapp.view.ui.auth.LoginActivity
import com.gentryx.todoapp.view.ui.main.MainActivity
import com.gentryx.todoapp.viewmodel.splash.SplashViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main
import org.jetbrains.anko.alert
import org.jetbrains.anko.intentFor

class SplashActivity : AppCompatActivity() {

    companion object {
        const val TAG = "SplashActivity"
    }

    private lateinit var splashViewModel: SplashViewModel
    private val mContext = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        GeneralHelper.hideStatusBar(this)

        splashViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            checkNetwork()
        }
    }

    suspend fun checkNetwork() {
        delay(2000L)

        val status = NetworkHelper.isNetworkConnected(this)

        if (status) {
            withContext(Main) {
                splashViewModel.token.observe(mContext, Observer {
                    if (it.isNullOrEmpty()) {
                        startActivity(intentFor<LoginActivity>())
                    } else {
                        splashViewModel.validateToken().observe(mContext, Observer {
                            if (it.code() == 200) {
                                val mesg = it.body()

                                if (mesg?.message == "true") {
                                    finish()
                                    startActivity(intentFor<MainActivity>())
                                } else {
                                    startActivity(intentFor<LoginActivity>())
                                }
                            }
                        })
                    }
                })
            }
        } else {
            withContext(Dispatchers.Main) {
                showAlertDialog()
            }
        }
    }

    fun showAlertDialog() {
        alert {
            isCancelable = false
            title = getString(R.string.error_no_internet)
            message = getString(R.string.error_no_internet_msg)
            positiveButton("Ok") {
                it.dismiss()

                val intent = Intent(Settings.ACTION_NETWORK_OPERATOR_SETTINGS)
                startActivity(intent)
            }
        }.show()
    }

    override fun onRestart() {
        super.onRestart()

        CoroutineScope(Dispatchers.IO).launch {
            checkNetwork()
        }
    }
}
