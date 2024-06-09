package com.example.aapkakirana

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            // Load the initial fragment
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeScreen())
                .commit()
        }
    }
}