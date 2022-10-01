package com.example.sibel_aybike_can_odev2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.sibel_aybike_can_odev2.databinding.SingupActivityBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var singupActivityBinding: SingupActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        singupActivityBinding = DataBindingUtil.setContentView(this, R.layout.singup_activity)

        singupActivityBinding.backButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        singupActivityBinding.singupButton.setOnClickListener {
            Toast.makeText(this, "Aybike", Toast.LENGTH_SHORT).show()
        }
    }
}