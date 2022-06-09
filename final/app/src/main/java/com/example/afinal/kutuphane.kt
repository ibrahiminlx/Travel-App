package com.example.afinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_kutuphane.*

class kutuphane : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kutuphane)

        recyclerview4.layoutManager = LinearLayoutManager(this)
        recyclerview4.adapter = verileradapter(MockList.getMockedVerilerListesi4())
    }
}