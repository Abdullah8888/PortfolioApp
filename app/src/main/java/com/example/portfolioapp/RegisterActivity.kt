package com.example.portfolioapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register_layout.*

class RegisterActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.register_layout)




        submit.setOnClickListener {
            doneAction()
        }
    }

    private fun doneAction() {
       val email = regEmail.text.toString()
       val pass = regPass.text.toString()
       val confirmPass = regConfirmPass.text.toString()

       if (!email.isEmpty() || !pass.isEmpty() || !confirmPass.isEmpty()) {
           val validateEmail = android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
           if (validateEmail) {
               if (pass == confirmPass) {
                   val sharedPreference =  getSharedPreferences("REGISTER_TABLE", Context.MODE_PRIVATE)
                   var editor = sharedPreference.edit()
                   editor.putString("email", email)
                   editor.putString("pass",pass)
                   editor.putString("confirmPass",confirmPass)
                   editor.commit()
                   Toast.makeText(applicationContext,"Successfully registered", Toast.LENGTH_SHORT).show()
                   gotoLogin()
               }
               else {
                   Toast.makeText(applicationContext,"password does not match", Toast.LENGTH_LONG).show()
               }
           }
           else {
               Toast.makeText(applicationContext,"email must be entered correctly", Toast.LENGTH_LONG).show()
           }

       }
        else {
           Toast.makeText(applicationContext,"All fields must be correctly filled", Toast.LENGTH_LONG).show()
       }
    }

    private fun gotoLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}