package com.example.afinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_market.*

class market : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_market)

        recyclerview6.layoutManager = LinearLayoutManager(this)
        recyclerview6.adapter = verileradapter(MockList.getMockedVerilerListesi6())
    }
}