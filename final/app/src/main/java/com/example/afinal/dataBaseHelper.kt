package com.example.afinal

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val database_name ="veritabani"
val table_name="kullanicilar"
val col_name="kullaniciadi"
val col_mail="email"
val col_sifre="sifre"
val col_id="id"
class dataBaseHelper(var context:Context):SQLiteOpenHelper(context,
database_name,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        var createTable = " CREATE TABLE  "+ table_name+" ( "+
                col_id+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                col_name+" VARCHAR(15), "+
                col_mail+" VARCHAR(25), "+
                col_sifre+" VARCHAR(15) ) "
        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }


    fun insertData(kullanici: Kullanici){
        val db=this.writableDatabase
        val cv=ContentValues()
        cv.put(col_name,kullanici.kullaniciAdi)
        cv.put(col_mail,kullanici.mail)
        cv.put(col_sifre,kullanici.sifre)
        var sonuc=db.insert(table_name,null,cv)
        if (sonuc==(-1).toLong()){
            Toast.makeText(context,"Hatalı veri girişi",Toast.LENGTH_LONG).show()
            println("hello")

        }else{
            Toast.makeText(context,"Kayıt Başarılı",Toast.LENGTH_LONG).show()
            println("hello2")
        }
    }

    fun checkUser(email: String, txtpassword: String): Boolean {

        val columns = arrayOf(col_id)
        val db = this.readableDatabase


        val selection = "$col_name = ?"

        val selectionArgs = arrayOf(email)

        val cursor = db.query(
            table_name, //Table to query
            columns,        //columns to return
            selection,      //columns for the WHERE clause
            selectionArgs,  //The values for the WHERE clause
            null,  //group the rows
            null,   //filter by row groups
            null
        )  //The sort order

        val cursorCount = cursor.count
        cursor.close()
        db.close()

        if (cursorCount > 0) {
            return true
        }
        return false
    }
}