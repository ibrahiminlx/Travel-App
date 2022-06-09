package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detay.*


class detay : AppCompatActivity() {
    private var isim : String?=null
    private var saat : String?=null
    private var ücret : String?=null
    private var puan : Double?=null
    private var gnlbilgi : String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)
        val degerlendirme = findViewById(R.id.buttondegerlendir) as Button
        degerlendirme.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,Degerlendirme::class.java)
            startActivity(intent)
        }
        val degerlendirmeler = findViewById(R.id.buttondegerlendirmeler) as Button
        degerlendirmeler.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this,detay3::class.java)
            startActivity(intent)
        }

        isim=intent.getStringExtra("isim")
        txtisim.text= isim.toString()
        saat=intent.getStringExtra("saat")
        txtsaat1.text="Çalışma Saatleri: "+ saat.toString()
        ücret=intent.getStringExtra("ücret")
        txtucret.text="Ücret: "+ ücret.toString()
        gnlbilgi=intent.getStringExtra("gnlbilgi")
        txtdetail.text="Açıklama: "+ gnlbilgi.toString()
        puan=intent.getDoubleExtra("puan", 0.0)
        txtpuan1.text="Puan: 5/"+ puan.toString()
        var foto:Int =intent.getIntExtra("foto",0)
        var imageview = findViewById<ImageView>(R.id.imgProfilePhoto)
        imageview.setImageResource(foto)



    }

}
