package com.ananta.ieco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class About : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        title = "About"
        
        val imgAbout: ImageView = findViewById(R.id.img_about)
        val tvName: TextView = findViewById(R.id.tv_about_name)
        val tvEmail: TextView = findViewById(R.id.tv_about_email)

        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)


        tvName.text = name
        tvEmail.text = email
        imgAbout.setImageResource(photo)

    }
}