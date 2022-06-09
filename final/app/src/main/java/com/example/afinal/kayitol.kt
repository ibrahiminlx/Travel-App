package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kayitol.*

class kayitol : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kayitol)

        //val binding = ActivityKayitolBinding.inflate(layoutInflater)
        val context = this
        var db =dataBaseHelper(context)
        context.buttonkayitol.setOnClickListener {
            var txtKullaniciAdi=context.etKullaniciadi.text.toString()
            var txtmail=context.etMail.text.toString()
            var txtsifre=context.etSifre.text.toString()
            if (txtKullaniciAdi.isNotEmpty() && txtmail.isNotEmpty() && txtsifre.isNotEmpty()){
                var kullanici = Kullanici(txtKullaniciAdi,txtmail,txtsifre)
                db.insertData(kullanici)
                println("hello3")
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)

            }else{
                Toast.makeText(applicationContext,"Lütfen Doğru veri girişi yapınız.",Toast.LENGTH_LONG).show()
                println("hello4")
            }


        }

        val anasayfagit =findViewById<Button>(R.id.maingitbtn)
        anasayfagit.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}