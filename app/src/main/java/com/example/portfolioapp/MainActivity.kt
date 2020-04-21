package com.example.portfolioapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row1.*
import kotlinx.android.synthetic.main.row2.*
import kotlinx.android.synthetic.main.row3.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImge.bringToFront()

        showLinks()
//        youtube.setOnClickListener {
//
//            val intent = Intent(Intent.ACTION_VIEW,
//                Uri.parse("http://www.youtube.com"))
//
//            startActivity(intent)
//        }


    }

    override fun onStart() {
        super.onStart()
        Log.d("Start", "The activity is on start state")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Stop", "The activity is on stop state")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Pause", "The activity is on pause state")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Destroy", "The activity is on destroy state")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Restart", "The activity is on restart state")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Resume", "The activity is on resume state")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("BackPressed", "The activity is on backpressed state")
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
    }

    fun showLinks() {
        youtube.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com"))

            startActivity(intent)
        }

        whatsap.setOnClickListener {


            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.whatsapp.com"))

            startActivity(intent)
        }

        bitbucket.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://bitbucket.org"))

            startActivity(intent)
        }

        facebook.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.facebook.com"))

            startActivity(intent)
        }

        //row2
        twitter.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://twitter.com/"))

            startActivity(intent)
        }

        linkedin.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.linkedin.com/"))

            startActivity(intent)
        }

        android.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.android.com"))

            startActivity(intent)
        }

        skype.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.skype.com/"))

            startActivity(intent)
        }

        //row3
        gmail.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://mail.google.com"))

            startActivity(intent)
        }

        google.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.google.com"))

            startActivity(intent)
        }

        instagram.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.instagram.com/"))

            startActivity(intent)
        }

        amazon.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.amazon.com/"))

            startActivity(intent)
        }


    }

}
