package com.example.afinal

lateinit var veriListesi23: List<veri>
lateinit var list : List<List<veri>>
data class veri(
    val profilePhotoLink: Int,
    val isim: String,
    val ucret: String,
    val saati: String,
    val genelbilgi: String,
    val position: Int,
    val puan: Double,
    var yorum: String,
    var puan2: String,




)


object MockList {

    fun getMockedVerilerListesi(): List<veri> {

        val tarihiveri1 = veri(
            R.drawable.kemeralti,
            "Kemeraltı Çarşısı",
            "₺0",
            "06.00-20.00",
            "Konak Vilayet'in arkasından başlıyor.Saat kulesinden Smyrna antik kentine kadar olan 15.000 dükkan.7-8 Camii,çok sayıda tarihi han.",
            0,
            4.0,
            "12312sadas",
            "0.0")
        val tarihiveri2 = veri(
            R.drawable.kordon,
            "Kordon Boyu",
            "₺0",
            "24-Saat",
            "İzmirin yazın vazgeçilmez yürüyüş durağı olur. Kışın rüzgar çok soğuk esse bile insanda yürüme isteği uyandıran bir yer.",
            1,
            4.5,
            "",
            "0.0")
        val tarihiveri3 = veri(
            R.drawable.asansor,
            "Tarihi Asansör",
            "₺0",
            "24-Saat",
            "İzmirin adeta simgesi olan asansördür. Içinde bir kafeteryada bulunur izmir Körfezi'ni izlemek güzeldir.",
            2,
            4.5,
            "",
            "0.0")
        val tarihiveri4 = veri(
            R.drawable.kadifekale,
            "Kadifekale",
            "₺0",
            "08.00-18.00",
            "Kadifekale,Büyük İskender zamanından günümüze kadar gelen büyük bir dünya mirasıdır.",
            3,
            4.5,
            "",
            "0.0")
        return listOf(tarihiveri1,tarihiveri2,tarihiveri3,tarihiveri4)

    }
    fun getMockedVerilerListesi2(): List<veri> {

        val otelveri1 = veri(
            R.drawable.otel1,
            "Izmir Marriott Hotel",
            "₺2.213",
            "24-Saat",
            "Şehrin merkezindeki konumu, odalarının temizliği, kahvaltısının çeşitliği gerçekten inanılmaz. oda manzarasından bahsetmiyorum bile. sanki odanıza ait deniziniz varmış gibi.",
            0,
            5.0,
            "",
            "0.0")
        val otelveri2 = veri(
            R.drawable.otel2,
            "Swissotel Büyük Efes Izmir",
            "₺2.201",
            "24-Saat",
            "İzmir’de gerek konumu gerekse hizmetleri gerekse çalışanların ilgisi açısından tek tercih edilecek otel.",
            1,
            4.5,
            "",
            "0.0")
        val otelveri3 = veri(
            R.drawable.otel3,
            "Hilton Garden Inn Izmir Bayrakli",
            "₺1.426",
            "24-Saat",
            "Otelin konumu, temizliği ve çalışanların güler yüzlü olması otelin kalitesini daha da arttırıyor, Hilton grubu hiçbir zaman bunlardan ödün vermiyor.",
            2,
            4.5,
            "",
            "0.0")
        val otelveri4 = veri(
            R.drawable.otel4,
            "Ramada Encore by Wyndham Izmir",
            "₺1.083",
            "24-Saat",
            "Modern konsepti ve dinamik kadrosu ile Ramada Encore İzmir alışılagelmiş otel deneyimlerinden farklı bir konaklama deneyimi yaşatıyor.",
            3,
            3.5,
            "",
            "0.0")
        return listOf(otelveri1,otelveri2,otelveri3,otelveri4)

    }
    fun getMockedVerilerListesi3(): List<veri> {

        val parkveri1 = veri(
            R.drawable.park1,
            "İzmir Doğal Yaşam Parkı",
            "₺10",
            "09:00-17:00",
            "Türkiye'de ki en güzel ve donanımlı doğal yaşam alanı. Özellikle çocukları olan aileler mutlaka burasını ziyaret etmeli.",
            0,
            4.5,
            "",
            "0.0")
        val parkveri2 = veri(
            R.drawable.park2,
            "Sasalı Piknik Alanı",
            "₺0",
            "10:00-19:00",
            "Hayvanat bahçesi de olan alanda çocuklarla güzel bir hafta sonu geçirebilirsiniz.",
            1,
            4.5,
            "",
            "0.0")
        val parkveri3 = veri(
            R.drawable.park3,
            "Karagol Tabiat Parki",
            "₺0",
            "24-Saat",
            "İzmir'de olan Tabiat Parkı dır piknik alanları yürüyüş Yolları aileler için güzel bir yerdir arabayla gidecekler için yollara dikkat etmeniz gerekir",
            2,
            4.0,
            "",
            "0.0")
        val parkveri4 = veri(
            R.drawable.park4,
            "Kulturpark",
            "₺0",
            "24-Saat",
            "Lunapark,sanat merkezi,müze,mescid,otopark,pakistan tanıtım merkezi,havuzlar,İBB,binaı,her şey var.çok keyifli.",
            3,
            4.5,
            "",
            "0.0")
        return listOf(parkveri1,parkveri2,parkveri3,parkveri4)

    }
    fun getMockedVerilerListesi4(): List<veri> {

        val kutuphaneveri1 = veri(
            R.drawable.kutuphane1,
            "Adile Naşit Kitaplığı",
            "₺0",
            "08:00-17:00",
            "Adile Naşit Parkı içerisinde yer alan bu kütüphane, Aya Peraskevi Kilisesi’nin Papaz Evi restore edilerek kuruluyor.",
            0,
            5.0,
            "",
            "0.0")
        val kutuphaneveri2 = veri(
            R.drawable.kutuphane2,
            "Havagazı Gençlik Merkezi Araştırma Kütüphanesi",
            "₺0",
            "Randevu almak gerekiyor.",
            "Bu kütüphane daha çok üniversite öğrencilerine sessiz, düzenli bir çalışma alanı sağlamak amacıyla hizmet veriyor.",
            1,
            4.5,
            "",
            "0.0")
        val kutuphaneveri3 = veri(
            R.drawable.kutuphane3,
            "Necip Paşa Kütüphanesi",
            "₺0",
            "08:00-17:00",
            "İzmir’de bulunan en önemli kütüphanelerden biri, Necip Paşa Kütüphanesi. Çünkü oldukça eski ve nitelikli eserleri bünyesinde barındırıyor. 1827 yılında yapılmış",
            2,
            4.0,
            "",
            "0.0")
        val kutuphaneveri4 = veri(
            R.drawable.kutuphane4,
            "İzmir Kütüphaneleri: Şato Kütüphanesi",
            "₺0",
            "08:00-17:00",
            "Şato Kütüphanesi, İzmir’de kurulan ilk dijital kütüphane olma özelliğine sahip. Kaynaklarını elektronik ortamlar aracılığıyla sağlıyor.",
            3,
            4.5,
            "",
            "0.0")
        return listOf(kutuphaneveri1,kutuphaneveri2,kutuphaneveri3,kutuphaneveri4)

    }
    fun getMockedVerilerListesi5(): List<veri> {

        val ibadetveri1 = veri(
            R.drawable.ibadet1,
            "Saint Polycarp Kilisesi",
            "₺0",
            "15.00-17.00",
            "17.yüzyıl yapımı bu tarihi kilise adeta bir şato.Çok görkemli ve güzeldir.",
            0,
            4.0,
            "",
            "0.0")
        val ibadetveri2 = veri(
            R.drawable.ibadet2,
            "Hisar Camisi",
            "₺0",
            "Namaz saatleri boyunca",
            "İzmir’in en eski ve tarihi camisi olup,1592 yılında Aydınoğlu Yakup bey tarafından yaptırılmıştır.",
            1,
            4.5,
            "",
            "0.0")
        val ibadetveri3 = veri(
            R.drawable.ibadet3,
            "Fatih Çinili Cami",
            "₺0",
            "Namaz saatleri boyunca",
            "Dış kismı çinilerle çevrili yeni yapılan camiidir.Izmiri yukaridan gorur,manzarasi güzeldir.",
            2,
            4.0,
            "",
            "0.0")
        val ibadetveri4 = veri(
            R.drawable.ibadet4,
            "Yali Mosque",
            "₺0",
            "08:00-17:00",
            "Ayşe hanım tarafından 1755-74 arasında yaptırılmış küçük ama önemli bir Camii.",
            3,
            3.5,
            "",
            "0.0")
        return listOf(ibadetveri1,ibadetveri2,ibadetveri3,ibadetveri4)

    }
    fun getMockedVerilerListesi6(): List<veri> {

        val marketveri1 = veri(
            R.drawable.market1,
            "BİM",
            "₺0",
            "09:00–21:00",
            "Pazaryeri Mahallesi 948 Sok. No:25 Konak / İZMİR",
            0,
            4.0,
            "",
            "0.0")
        val marketveri2 = veri(
            R.drawable.market2,
            "ŞOK",
            "₺0",
            "09:00–21:00",
            "Akdeniz, Gazi Blv. No:74/A, 35210 Konak/İzmir",
            1,
            3.5,
            "",
            "0.0")
        val marketveri3 = veri(
            R.drawable.market3,
            "A-101",
            "₺0",
            "10:00–18:00",
            "Akarcalı, 1126. Sk. No:31/a, 35240 Konak/İzmir",
            2,
            3.5,
            "",
            "0.0")
        val marketveri4 = veri(
            R.drawable.market4,
            "5M Migros",
            "₺0",
            "09:00–22:00",
            "Kazımdirik, 372. Sk. No:36, 35100 Bornova/İzmir.",
            3,
            3.5,
            "",
            "0.0")
        return listOf(marketveri1,marketveri2,marketveri3,marketveri4)

    }
    fun getMockedVerilerListesi7(): List<veri> {

        val otoparkveri1 = veri(
            R.drawable.otopark1,
            "Tam Otomatik Alsancak Otoparkı",
            "₺345-(Aylık)",
            "08:00–18:00",
            "0 –   3 saat :   9,00 TL\n" +
                    "3 –   6 saat :   13,50 TL\n" +
                    "6 – 12 saat : 20,00 TL\n" +
                    "12 – 24 saat : 25,00 TL",
            0,
            5.0,
            "",
            "0.0")
        val otoparkveri2 = veri(
            R.drawable.otopark2,
            "Bostanlı Migros Üstü Katlı Otoparkı",
            "₺220-(Aylık)",
            "09:00–19:00",
            "0 – 3 saat : 6,50 TL\n" +
                    "3 – 6 saat : 8,50 TL\n" +
                    "6 – 12 saat : 11,50 TL\n" +
                    "12 – 24 saat : 17,00 TL",
            1,
            3.5,
            "",
            "0.0")
        val otoparkveri3 = veri(
            R.drawable.otopark3,
            "Alaybey Katlı Otoparkı",
            "₺140-(Aylık)",
            "09:00–19:00",
            "0 – 3 saat : 5,50 TL\n" +
                    "3 – 6 saat : 7,50 TL\n" +
                    "6 – 12 saat : 10,00 TL\n" +
                    "12 – 24 saat : 15,00 TL",
            2,
            3.5,
            "",
            "0.0")
        val otoparkveri4 = veri(
            R.drawable.otopark4,
            "Mimar Kemalettin Katlı Otoparkı",
            "₺345-(Aylık)",
            "09:00–20:00",
            "0 – 12 saat : 9,50TL\n" +
                    "12 – 24 saat : 19,00TL.",
            3,
            4.0,
            "",
            "0.0")
        return listOf(otoparkveri1,otoparkveri2,otoparkveri3,otoparkveri4)

    }
    fun veriler(): List<veri> {
        val veri11 = MockList.getMockedVerilerListesi()
        val veri12 = MockList.getMockedVerilerListesi2()
        val veri13 = MockList.getMockedVerilerListesi3()
        val veri14 = MockList.getMockedVerilerListesi4()
        val veri15 = MockList.getMockedVerilerListesi5()
        val veri16 = MockList.getMockedVerilerListesi6()
        val veri17 = MockList.getMockedVerilerListesi7()
        var toplam = veri11.plus(veri12).plus(veri13).plus(veri14).plus(veri15).plus(veri16).plus(veri17)


        return toplam
    }


    fun get(position: Int): veri {
        getMockedVerilerListesi().forEach({ data ->
            if (data.position.equals(position)){
                return data
            }

        })
        return null!!
    }
    fun get1(position: Int): veri {
        getMockedVerilerListesi2().forEach({ data ->
            if (data.position.equals(position)){
                return data
            }

        })
        return null!!
    }
    fun get2(position: Int): veri {
        getMockedVerilerListesi3().forEach({ data ->
            if (data.position.equals(position)){
                return data
            }

        })
        return null!!
    }
    fun get3(position: Int): veri {
        getMockedVerilerListesi4().forEach({ data ->
            if (data.position.equals(position)){
                return data
            }

        })
        return null!!
    }
    fun get4(position: Int): veri {
        getMockedVerilerListesi5().forEach({ data ->
            if (data.position.equals(position)){
                return data
            }

        })
        return null!!
    }
    fun get5(position: Int): veri {
        getMockedVerilerListesi6().forEach({ data ->
            if (data.position.equals(position)){
                return data
            }

        })
        return null!!
    }
    fun get6(position: Int): veri {
        getMockedVerilerListesi7().forEach({ data ->
            if (data.position.equals(position)){
                return data
            }

        })
        return null!!
    }
    fun get7(position: Int): veri {
        veriler().forEach({ data ->
            if (data.equals(position)){
            }

        })

        return null!!
    }

}
