package com.example.afinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_park.*

class park : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park)


        recyclerview3.layoutManager = LinearLayoutManager(this)
        recyclerview3.adapter = verileradapter(MockList.getMockedVerilerListesi3())
    }
}