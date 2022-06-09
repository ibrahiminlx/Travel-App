package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.afinal.databinding.ActivityDegerlendirmeBinding
import com.example.afinal.databinding.ActivityOtoparkBinding


class Degerlendirme : AppCompatActivity() {
    private var txtyorum : String?=null
    private var txtpuan : String?=null
    lateinit var binding: ActivityOtoparkBinding
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        val binding = ActivityDegerlendirmeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            binding.textViewdegerlendir2.text=rating.toString()

        }


        binding.btndegerkaydet.setOnClickListener { view ->
            run {  sendData(binding,view) }



        }
    }

    fun sendData(binding: ActivityDegerlendirmeBinding,view:View) {


        var yorum = binding.etYorum.text.toString().trim()
        var puan2 = binding.ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            binding.textViewdegerlendir2.text=rating.toString()
        }
        var puansonuc = binding.textViewdegerlendir2.text.toString()


        val intent = Intent(view.context,detay3::class.java)
        intent.putExtra("yorum1",yorum)
        intent.putExtra("puan",puansonuc)
        startActivity(intent)









        /*
        var list = ArrayList<String>()
        list.add(yorum)

         */




    }
}
