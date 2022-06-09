package com.example.afinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_ibadet.*

class ibadet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ibadet)

        recyclerview5.layoutManager = LinearLayoutManager(this)
        recyclerview5.adapter = verileradapter(MockList.getMockedVerilerListesi5())
    }
}