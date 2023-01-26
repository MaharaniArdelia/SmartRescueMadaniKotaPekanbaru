package com.example.smartrescuemadanikotapekanbaru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Lapor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lapor)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, Home::class.java)
        startActivity(i)
    }

    fun lapor(view: View?) {
        val i = Intent(applicationContext, Home::class.java)
        startActivity(i)
    }
}