package com.example.davaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<TextView>(R.id.info).text = intent?.extras?.getString("FirstName", "DIMITRI")
        findViewById<TextView>(R.id.info).text = intent?.extras?.getString("LastName", "ZAKAIDZE")

        val info = intent.extras?.getString("password","112")
    }
}