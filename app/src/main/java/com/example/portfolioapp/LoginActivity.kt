package com.example.portfolioapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_layout.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.login_layout)

        signUp.setOnClickListener {
            //Toast.makeText(applicationContext,"this is toast message", Toast.LENGTH_SHORT).show()
            gotoRegisterActivity()
        }

        done.setOnClickListener {

            gotoMainActivity()
        }

    }

    private fun gotoRegisterActivity() {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
    }

    private fun gotoMainActivity() {
        val email = email.text.toString()
        val pass = password.text.toString()

        if (!email.isEmpty() && !pass.isEmpty()) {
            val validateEmail = android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
            if (validateEmail) {
                val sharedPreference =  getSharedPreferences("REGISTER_TABLE", Context.MODE_PRIVATE)
                val storedEmail = sharedPreference.getString("email", "")
                val storedPass = sharedPreference.getString("pass", "")

                if (email == storedEmail && pass == storedPass) {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(applicationContext,"Login successfully", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(applicationContext,"Incorrect email and password", Toast.LENGTH_SHORT).show()
                }

            }
            else {
                Toast.makeText(applicationContext,"email must be entered correctly", Toast.LENGTH_LONG).show()
            }


        }
        else {
            Toast.makeText(applicationContext,"email and password must be correctly filled", Toast.LENGTH_SHORT).show()
        }

    }
}