package com.example.icetask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //write code here
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val tableNumberEditText = findViewById<EditText>(R.id.tableNumberEditText)


        multiplyButton.setOnClickListener{
        // Create the Explicit Intent
            val intent = Intent(this, MultiplicationTable::class.java)

         // add the table number to intent
              intent.putExtra("tableNumber", tableNumberEditText.text.toString())

         // Start your Activity
         startActivity(intent)

        }

    }
}