package com.example.transportgps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)




        splashScreen.setKeepOnScreenCondition(){ true }

        val intent = Intent ( this, MainActivity::class.java)
        startActivity(intent)
        finish()


    }
}