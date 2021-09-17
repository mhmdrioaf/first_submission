package com.ananta.ieco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailPage : AppCompatActivity() {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val image: ImageView = findViewById(R.id.img_item_photo)
        val btnFavorite: Button = findViewById(R.id.btn_favorite)
        val btnShare: Button = findViewById(R.id.btn_share)


        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        btnFavorite.setOnClickListener{
            Toast.makeText(this, "Telah menambahkan $name kedalam Favorite!", Toast.LENGTH_SHORT).show()
        }

        btnShare.setOnClickListener{
            Toast.makeText(this, "Telah membagikan $name", Toast.LENGTH_SHORT).show()
        }

        tvName.text = name
        tvDetail.text = detail
        image.setImageResource(photo)

        title = name

    }
}