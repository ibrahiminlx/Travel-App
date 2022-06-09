package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity



class Anasayfa : AppCompatActivity() {

    companion object {
        lateinit var instance: Anasayfa
    }

    init {
        instance = this
    }

    fun switchDetail(view: View){
        val intent = Intent(this,detay::class.java)
        startActivity(intent)



    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anasayfa)
        val tarihi = findViewById(R.id.imageView) as ImageView
        tarihi.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,tarihiyerler::class.java)
            startActivity(intent)
        }
        val oteller = findViewById(R.id.imageView2) as ImageView
        oteller.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,otel::class.java)
            startActivity(intent)
        }
        val favoriler1 = findViewById(R.id.imageView11) as ImageView
        favoriler1.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,favoriler::class.java)
            startActivity(intent)
        }
        val parklar = findViewById(R.id.imageView3) as ImageView
        parklar.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,park::class.java)
            startActivity(intent)
        }
        val kutuphaneler = findViewById(R.id.imageView4) as ImageView
        kutuphaneler.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,kutuphane::class.java)
            startActivity(intent)
        }
        val ibadethaneler = findViewById(R.id.imageView5) as ImageView
        ibadethaneler.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,ibadet::class.java)
            startActivity(intent)
        }
        val marketler = findViewById(R.id.imageView6) as ImageView
        marketler.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,market::class.java)
            startActivity(intent)
        }
        val otoparklar = findViewById(R.id.imageView7) as ImageView
        otoparklar.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,otopark::class.java)
            startActivity(intent)
        }
    }

}