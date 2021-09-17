package com.ananta.ieco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvDestinations: RecyclerView
    private var list: ArrayList<Destination> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDestinations = findViewById(R.id.rv_destinations)
        rvDestinations.hasFixedSize()

        list.addAll(DestinationsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvDestinations.layoutManager = LinearLayoutManager(this)
        val listDestinationAdapter = ListDestinationAdapter(list)
        rvDestinations.adapter = listDestinationAdapter

        listDestinationAdapter.setOnItemClickCallback(object: ListDestinationAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Destination) {
                sendSelectedDestination(data)
            }
        })
    }

    private fun sendSelectedDestination(destination: Destination) {
        val moveIntent = Intent(this@MainActivity, DetailPage::class.java)
        moveIntent.putExtra(DetailPage.EXTRA_NAME, destination.name)
        moveIntent.putExtra(DetailPage.EXTRA_DETAIL, destination.detail)
        moveIntent.putExtra(DetailPage.EXTRA_PHOTO, destination.photo)
        startActivity(moveIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.itemId

        if (id == R.id.menu_about) {
            val moveIntent = Intent(this@MainActivity, About::class.java)
            moveIntent.putExtra(About.EXTRA_NAME, "Muhammad Rio Ananta Firdaus")
            moveIntent.putExtra(About.EXTRA_EMAIL, "rio.10519152@mahasiswa.unikom.ac.id")
            moveIntent.putExtra(About.EXTRA_PHOTO, R.drawable.foto_diri)
            startActivity(moveIntent)
        }

        return super.onOptionsItemSelected(item)
    }
}