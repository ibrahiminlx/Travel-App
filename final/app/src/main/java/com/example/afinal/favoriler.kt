package com.example.afinal

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_favoriler.*

class favoriler : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favoriler)

        recyclerview15.layoutManager = LinearLayoutManager(this)
        //var a = verileradapter(MockList.getMockedVerilerListesi())
        //var b = verileradapter(MockList.getMockedVerilerListesi2())
        //var veriListesi23: List<veri>
        //for (x in MockList.getMockedVerilerListesi6()){
        //    veriListesi23= listOf(x)
        //}
        //for (x in MockList.getMockedVerilerListesi2()){
        //    veriListesi23= listOf(x)
        //}
        recyclerview15.adapter = verileradapter(MockList.veriler())




    }


}