package com.example.sibel_aybike_can_odev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.sibel_aybike_can_odev2.databinding.LoginActivityBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var loginActivityBinding: LoginActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loginActivityBinding = DataBindingUtil.setContentView(this, R.layout.login_activity)

        loginActivityBinding.backButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val username = loginActivityBinding.usernameInputLayout.editText?.text.toString()
        val password = loginActivityBinding.passwordInputLayout.editText?.text.toString()

        loginActivityBinding.loginButton.setOnClickListener {
            Toast.makeText(this, "Username: " + "$username" + "\n" + "Password: " + "$password", Toast.LENGTH_SHORT).show()
        }

        loginActivityBinding.createAccount.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}