package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var tv: TextView
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.departButton)
        tv = findViewById(R.id.spaceStationLabel)

        button.setOnClickListener {
            counter++
            tv.text = counter.toString()
        }
    }
}







