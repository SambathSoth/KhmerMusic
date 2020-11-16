package com.smartherd.khmermusic.activities.download

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.search.SearchActivity
import com.smartherd.khmermusic.activities.singer.SingerActivity
import com.smartherd.khmermusic.activities.song.SongActivity

class DownloadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_download)

        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.selectedItemId = R.id.download

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.song -> {
                    val intent = Intent(applicationContext, SongActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                }
                R.id.singer -> {
                    val intent = Intent(applicationContext, SingerActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                }
                R.id.download -> {}
                R.id.search -> {
                    val intent = Intent(applicationContext, SearchActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                }
            }
            true
        }
    }
}