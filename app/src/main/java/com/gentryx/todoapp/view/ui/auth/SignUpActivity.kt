package com.gentryx.todoapp.view.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gentryx.todoapp.R
import com.gentryx.todoapp.model.remote.request.auth.LoginRequest
import com.gentryx.todoapp.model.remote.request.auth.RegisterRequest
import com.gentryx.todoapp.model.remote.response.auth.RegisterResponse
import com.gentryx.todoapp.viewmodel.auth.RegisterViewModel
import kotlinx.android.synthetic.main.activity_sign_up.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk27.coroutines.onClick

class SignUpActivity : AppCompatActivity() {

    companion object {
        const val TAG = "SignUpActivity"
    }

    private lateinit var viewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)

        btn_sign_up.onClick { prepareSignUp() }

        tv_login.onClick { launchLoginActivity() }
    }

    private fun launchLoginActivity() {
        startActivity(intentFor<LoginActivity>())
    }

    private fun prepareSignUp() {
        val name = txt_userName.text.toString()
        val email = txt_email.text.toString()
        val password = txt_password.text.toString()
        val confirm_password = txt_confirm_password.text.toString()

        if (name.isEmpty()) {
            alert {
                isCancelable = false
                title = getString(R.string.empty_username_title)
                message = getString(R.string.empty_username_message)
                positiveButton("OK") {
                    it.dismiss()
                }
            }.show()
        } else if (email.isEmpty()) {
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
        } else if (confirm_password.isEmpty()) {
            alert {
                isCancelable = false
                title = getString(R.string.empty_confirm_password_title)
                message = getString(R.string.empty_confirm_password_message)
                positiveButton("OK") {
                    it.dismiss()
                }
            }.show()
        } else if (confirm_password != password) {
            alert {
                isCancelable = false
                title = getString(R.string.error_confirm_password_title)
                message = getString(R.string.error_confirm_password_message)
                positiveButton("OK") {
                    it.dismiss()
                }
            }.show()
        } else {
            val signUpData = RegisterRequest(name, email, password, confirm_password)
            signUp(signUpData)
        }
    }

    private fun signUp(signUpData: RegisterRequest) {

        viewModel.register(signUpData).observe(this, Observer {
            response_data ->

            if (response_data.code() == 201) {
                val data = response_data.body();
                Log.e(TAG, "user name: ${data?.user_name}")
            } else {
                Log.e(TAG, "error code: ${response_data.code()} error message: ${response_data.errorBody()}")
            }
        })
    }
}
