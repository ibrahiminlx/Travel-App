package com.example.afinal

import android.os.Bundle
import android.widget.Adapter
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.switchmaterial.SwitchMaterial
import kotlinx.android.synthetic.main.activity_tarihiyerler.*

class tarihiyerler : AppCompatActivity() {

    private lateinit var frameLayout: FrameLayout
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: Adapter
    private lateinit var switchMaterial: SwitchMaterial

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarihiyerler)



        switch1.setOnClickListener(){
            if (switch1.isChecked()==true) {
                Toast.makeText(applicationContext,"Favori seçeneği açık",Toast.LENGTH_LONG).show()
//
            }else if (switch1.isChecked()==false){
                recyclerview1.layoutManager = LinearLayoutManager(this)
                recyclerview1.adapter = verileradapter(MockList.getMockedVerilerListesi())
//
            }
        }
        recyclerview1.layoutManager = LinearLayoutManager(this)
        recyclerview1.adapter = verileradapter(MockList.getMockedVerilerListesi())


    }

}

