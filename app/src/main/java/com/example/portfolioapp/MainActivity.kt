package com.example.portfolioapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row1.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImge.bringToFront()

        youtube.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.youtube.com"))

            startActivity(intent)
        }
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

}
