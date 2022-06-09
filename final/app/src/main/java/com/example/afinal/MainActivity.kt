package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val context = this
        var db =dataBaseHelper(context)
        val anasayfa1 =findViewById<Button>(R.id.anasayfabtn)

        anasayfa1.setOnClickListener {
            var txtKullaniciAdi1=context.editTextTextPersonName2.text.toString()
            var txtpassword=context.editTextTextPassword.text.toString()
            if (db.checkUser(txtKullaniciAdi1,txtpassword) ){
                val intent = Intent(this,Anasayfa::class.java)
                startActivity(intent)
                Toast.makeText(context,"giriş başarılı", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(context,"hatalı giriş", Toast.LENGTH_LONG).show()
            }

        }

        val anasayfakayitol =findViewById<Button>(R.id.anasayfakayitol)
        anasayfakayitol.setOnClickListener {
            val intent = Intent(this,kayitol::class.java)
            startActivity(intent)
        }
    }

}


