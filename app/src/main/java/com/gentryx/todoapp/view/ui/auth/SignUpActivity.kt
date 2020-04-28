package com.gentryx.todoapp.view.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gentryx.todoapp.R
import com.gentryx.todoapp.model.remote.request.auth.RegisterRequest
import com.gentryx.todoapp.viewmodel.auth.SignUpViewModel
import kotlinx.android.synthetic.main.activity_sign_up.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk27.coroutines.onClick

class SignUpActivity : AppCompatActivity() {

    companion object {
        const val TAG = "SignUpActivity"
    }

    private lateinit var viewModel: SignUpViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)

        btn_sign_up.onClick { prepareSignUp() }
        tv_login.onClick { launchLoginActivity() }

        observer()
    }

    private fun launchLoginActivity() {
        startActivity(intentFor<LoginActivity>())
    }

    private fun prepareSignUp() {
        val name = txt_userName.text.toString()
        val email = txt_email.text.toString()
        val password = txt_password.text.toString()
        val confirmPassword = txt_confirm_password.text.toString()

        when {
            name.isEmpty() -> {
                alert {
                    isCancelable = false
                    title = getString(R.string.empty_username_title)
                    message = getString(R.string.empty_username_message)
                    positiveButton("OK") {
                        it.dismiss()
                    }
                }.show()
            }
            email.isEmpty() -> {
                alert {
                    isCancelable = false
                    title = getString(R.string.empty_email_title)
                    message = getString(R.string.empty_email_message)
                    positiveButton("OK") {
                        it.dismiss()
                    }
                }.show()
            }
            password.isEmpty() -> {
                alert {
                    isCancelable = false
                    title = getString(R.string.empty_password_title)
                    message = getString(R.string.empty_password_message)
                    positiveButton("OK") {
                        it.dismiss()
                    }
                }.show()
            }
            confirmPassword.isEmpty() -> {
                alert {
                    isCancelable = false
                    title = getString(R.string.empty_confirm_password_title)
                    message = getString(R.string.empty_confirm_password_message)
                    positiveButton("OK") {
                        it.dismiss()
                    }
                }.show()
            }
            confirmPassword != password -> {
                alert {
                    isCancelable = false
                    title = getString(R.string.error_confirm_password_title)
                    message = getString(R.string.error_confirm_password_message)
                    positiveButton("OK") {
                        it.dismiss()
                    }
                }.show()
            }
            else -> {
                val signUpData = RegisterRequest(name, email, password, confirmPassword)
                signUp(signUpData)
            }
        }
    }

    private fun signUp(signUpData: RegisterRequest) {
        viewModel.register(signUpData)
    }

    private fun observer() {
        viewModel.isError.observe(this, Observer {
            errorDialog(it)
        })

        viewModel.isSuccess.observe(this, Observer {
            it?.run {
                if (it) {
                    successDialog()
                } else {
                    unSuccessfulDialog()
                }
            }
        })

        viewModel.loading.observe(this, Observer {
            pb_sign_up.visibility = if (it) View.VISIBLE else View.GONE
        })
    }

    private fun successDialog() {
        alert {
            title = getString(R.string.title_successful_sign_up)
            message = getString(R.string.msg_sign_up_successful)
            isCancelable = false
            positiveButton(getString(R.string.btn_ok)) {dialog ->
                finish()
                dialog.dismiss()
            }
        }.show()
    }

    private fun unSuccessfulDialog() {
        alert {
            title = getString(R.string.title_unsuccessful_dialog)
            message = getString(R.string.msg_add_task_unsuccessful)
            isCancelable = false
            positiveButton(getString(R.string.btn_ok)) {dialog ->
                dialog.dismiss()
            }
        }.show()
    }

    private fun errorDialog(errorMsg: String) {
        alert {
            title = getString(R.string.title_error_dialog)
            message = errorMsg
            isCancelable = false
            positiveButton(getString(R.string.btn_ok)) {dialog ->
                dialog.dismiss()
            }
        }.show()
    }
}
