package com.example.afinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_otel.*

class otel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otel)


        recyclerview2.layoutManager = LinearLayoutManager(this)
        recyclerview2.adapter = verileradapter(MockList.getMockedVerilerListesi2())

    }
}