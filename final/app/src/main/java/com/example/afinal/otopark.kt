package com.example.afinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_otopark.*

class otopark : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otopark)

        recyclerview7.layoutManager = LinearLayoutManager(this)
        recyclerview7.adapter = verileradapter(MockList.getMockedVerilerListesi7())
    }
}