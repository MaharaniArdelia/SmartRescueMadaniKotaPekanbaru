package com.example.smartrescuemadanikotapekanbaru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Riwayat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, Home::class.java)
        startActivity(i)
    }

    fun home(view: View?) {
        val i = Intent(applicationContext, Home::class.java)
        startActivity(i)
    }

    fun edukasi(view: View?) {
        val i = Intent(applicationContext, Edukasi1::class.java)
        startActivity(i)
    }

    fun lapor(view: View?) {
        val i = Intent(applicationContext, Lapor::class.java)
        startActivity(i)
    }

    fun histrory(view: View?) {
        val i = Intent(applicationContext, Riwayat::class.java)
        startActivity(i)
    }

    fun profile(view: View?) {
        val i = Intent(applicationContext, Login::class.java)
        startActivity(i)
    }
}