package com.example.biker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText



class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        val loginButton: Button = findViewById(R.id.biker_login_button)
        val loginEmail: TextInputEditText = findViewById(R.id.login_email)
        val loginPassword: TextInputEditText = findViewById(R.id.login_password)
        val textLoginEmail = loginEmail.text
        val textLoginPassword = loginPassword.text
        loginButton.setOnClickListener {
            if(textLoginEmail.isNullOrBlank() && textLoginPassword.isNullOrBlank()) {
                Toast.makeText(this, "Please fill the required fields", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "$textLoginEmail is logged in!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }


}