package com.nemov.shinyusabillacampaign

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        cl_root.postDelayed(
            {
                Toast.makeText(applicationContext, "Send Usabilla campaign event", Toast.LENGTH_SHORT).show()
                sendEvent(applicationContext, supportFragmentManager)
            },
            1000)
    }
}
