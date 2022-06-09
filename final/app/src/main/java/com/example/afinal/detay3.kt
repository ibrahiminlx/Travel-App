package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detay3.*

class detay3 : AppCompatActivity() {
    private var yorum : String?=null
    private var saat : String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay3)



        yorum=intent.getStringExtra("yorum1")
        tvYorum.text= yorum.toString()
        yorum=intent.getStringExtra("puan")
        tvPuan.text= yorum.toString()
        println(yorum+"isim")


        val oteller = findViewById(R.id.btngeridon) as Button
        oteller.setOnClickListener {
            val intent = Intent(this,Anasayfa::class.java)
            startActivity(intent)
        }



    }
}