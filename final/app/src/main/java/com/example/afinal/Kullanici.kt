package com.example.afinal

class Kullanici {
    var id:Int=0
    var kullaniciAdi:String=""
    var mail:String=""
    var sifre:String=""
    constructor(kullaniciAdi:String,mail:String,sifre:String){
        this.kullaniciAdi = kullaniciAdi
        this.mail=mail
        this.sifre=sifre
    }
    constructor(){

    }

}