package com.gentryx.todoapp.view.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gentryx.todoapp.R
import com.gentryx.todoapp.model.remote.request.auth.LoginRequest
import com.gentryx.todoapp.model.remote.response.auth.LoginResponse
import com.gentryx.todoapp.view.ui.main.MainActivity
import com.gentryx.todoapp.viewmodel.auth.LoginViewModel
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk27.coroutines.onClick

class LoginActivity : AppCompatActivity() {

    companion object {
        const val TAG = "LoginActivity"
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        viewModel.init(this)

        btn_login.onClick { prepareLogin() }

        tv_signup.onClick { launchSignUpActivity() }
    }

    private fun launchSignUpActivity() {
        startActivity(intentFor<SignUpActivity>())
    }

    private fun prepareLogin() {
        val email = txt_userId.text.toString()
        val password = txt_password.text.toString()

        if (email.isEmpty()) {
            alert {
                isCancelable = false
                title = getString(R.string.empty_email_title)
                message = getString(R.string.empty_email_message)
                positiveButton("OK") {
                    it.dismiss()
                }
            }.show()
        } else if (password.isEmpty()) {
            alert {
                isCancelable = false
                title = getString(R.string.empty_password_title)
                message = getString(R.string.empty_password_message)
                positiveButton("OK") {
                    it.dismiss()
                }
            }.show()
        } else {
            val login_request = LoginRequest(email, password)
            login(login_request)
        }
    }

    private fun login(login_request: LoginRequest) {

        viewModel.login(login_request).observe(this, Observer {
            if (it.code() == 200) {
                val data = it.body()

                data?.let { saveUserData(data) }
                Log.d(TAG, "login successful")
            } else {
                Log.e(TAG, "error code: ${it.code()} error message: ${it.errorBody()}")
            }
        })

    }

    private fun saveUserData(loginResponse: LoginResponse) {
        viewModel.saveUserDetails(loginResponse).observe(this, Observer {
            if (it) {
                finish()
                startActivity(intentFor<MainActivity>())
            }
        })
    }
}
