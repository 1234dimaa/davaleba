package com.example.davaleba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText: TextView
    private lateinit var editText2: TextView
    private lateinit var password: TextView
    private lateinit var button: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        editText = findViewById(R.id.editText2)
        password = findViewById(R.id.pass1)
        button = findViewById(R.id.button1)

        button.setOnClickListener {
            val ragaca = editText.text.toString()
            val ragaca2 = editText2.text.toString()
            val ragaca3 = password.text.toString()
            val intent = Intent(this,second::class.java)
            intent.putExtra("FirstName", ragaca)
            intent.putExtra("LastName", ragaca2)
            intent.putExtra("UserName", ragaca3)
            startActivity(intent)


        }

    }
}