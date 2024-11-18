package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MyViewModel : ViewModel() {
    init {
        Log.d("RRR","init MyViewModel")

    }
    val counter = MutableLiveData<Int>()
    fun updateCounter() {
       // counter.value.plus(1)
        counter.value =  (counter.value ?: 0) + 1
    }
}

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var tv: TextView
    lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.departButton)
        tv = findViewById(R.id.spaceStationLabel)
        Log.d("RRR","onCreate")
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        button.setOnClickListener {
            myViewModel.updateCounter()
        }
        myViewModel.counter.observe(this, Observer {
            tv.text = it.toString()
        })
    }
}







