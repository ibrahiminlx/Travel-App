package com.example.afinal

import android.content.Intent
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import verilerViewHolder

class verileradapter(val veriListesi: List<veri>) :
    RecyclerView.Adapter<verilerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): verilerViewHolder {
        return verilerViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return veriListesi.size
    }

    override fun onBindViewHolder(holder: verilerViewHolder, position: Int) {
        holder.bind(veriListesi[position])
        //holder.btndetayy.setOnClickListener { println(position) }

        holder.btndetayy.setOnClickListener { view ->
            run {


                val veri = MockList.get(position)
                val veri1 = MockList.get1(position)
                val veri2 = MockList.get2(position)
                val veri3 = MockList.get3(position)
                val veri4 = MockList.get4(position)
                val veri5 = MockList.get5(position)
                val veri6 = MockList.get6(position)
                val veri7 = MockList.get7(position)


                if (MockList.getMockedVerilerListesi()==veriListesi){
                    val intent = Intent(view.context,detay::class.java)
                    intent.putExtra("isim",veri.isim)
                    intent.putExtra("foto",veri.profilePhotoLink)
                    intent.putExtra("gnlbilgi",veri.genelbilgi)
                    intent.putExtra("saat",veri.saati)
                    intent.putExtra("ücret",veri.ucret)
                    intent.putExtra("puan",veri.puan)
                    view.context.startActivity(intent)
                }
                else if (MockList.getMockedVerilerListesi2()==veriListesi){
                    val intent1 = Intent(view.context,detay::class.java)
                    intent1.putExtra("isim",veri1.isim)
                    intent1.putExtra("foto",veri1.profilePhotoLink)
                    intent1.putExtra("gnlbilgi",veri1.genelbilgi)
                    intent1.putExtra("saat",veri1.saati)
                    intent1.putExtra("ücret",veri1.ucret)
                    intent1.putExtra("puan",veri1.puan)
                    view.context.startActivity(intent1)

                }
                else if (MockList.getMockedVerilerListesi3()==veriListesi){
                    val intent2 = Intent(view.context,detay::class.java)
                    intent2.putExtra("isim",veri2.isim)
                    intent2.putExtra("foto",veri2.profilePhotoLink)
                    intent2.putExtra("gnlbilgi",veri2.genelbilgi)
                    intent2.putExtra("saat",veri2.saati)
                    intent2.putExtra("ücret",veri2.ucret)
                    intent2.putExtra("puan",veri2.puan)
                    view.context.startActivity(intent2)

                }
                else if (MockList.getMockedVerilerListesi4()==veriListesi){
                    val intent3 = Intent(view.context,detay::class.java)
                    intent3.putExtra("isim",veri3.isim)
                    intent3.putExtra("foto",veri3.profilePhotoLink)
                    intent3.putExtra("gnlbilgi",veri3.genelbilgi)
                    intent3.putExtra("saat",veri3.saati)
                    intent3.putExtra("ücret",veri3.ucret)
                    intent3.putExtra("puan",veri3.puan)
                    view.context.startActivity(intent3)

                }
                else if (MockList.getMockedVerilerListesi5()==veriListesi){
                    val intent4 = Intent(view.context,detay::class.java)
                    intent4.putExtra("isim",veri4.isim)
                    intent4.putExtra("foto",veri4.profilePhotoLink)
                    intent4.putExtra("gnlbilgi",veri4.genelbilgi)
                    intent4.putExtra("saat",veri4.saati)
                    intent4.putExtra("ücret",veri4.ucret)
                    intent4.putExtra("puan",veri4.puan)
                    view.context.startActivity(intent4)

                }
                else if (MockList.getMockedVerilerListesi6()==veriListesi){
                    val intent5 = Intent(view.context,detay::class.java)
                    intent5.putExtra("isim",veri5.isim)
                    intent5.putExtra("foto",veri5.profilePhotoLink)
                    intent5.putExtra("gnlbilgi",veri5.genelbilgi)
                    intent5.putExtra("saat",veri5.saati)
                    intent5.putExtra("ücret",veri5.ucret)
                    intent5.putExtra("puan",veri5.puan)
                    view.context.startActivity(intent5)

                }
                else if (MockList.getMockedVerilerListesi7()==veriListesi){
                    val intent6 = Intent(view.context,detay::class.java)
                    intent6.putExtra("isim",veri6.isim)
                    intent6.putExtra("foto",veri6.profilePhotoLink)
                    intent6.putExtra("gnlbilgi",veri6.genelbilgi)
                    intent6.putExtra("saat",veri6.saati)
                    intent6.putExtra("ücret",veri6.ucret)
                    intent6.putExtra("puan",veri6.puan)
                    view.context.startActivity(intent6)

                }
                else if (MockList.veriler()==veriListesi){
                    val intent7 = Intent(view.context,detay::class.java)
                    intent7.putExtra("isim",veri7.isim)
                    intent7.putExtra("foto",veri7.profilePhotoLink)
                    intent7.putExtra("gnlbilgi",veri7.genelbilgi)
                    intent7.putExtra("saat",veri7.saati)
                    intent7.putExtra("ücret",veri7.ucret)
                    intent7.putExtra("puan",veri7.puan)
                    view.context.startActivity(intent7)

                }







            }



        }


    }


}

