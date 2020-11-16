package com.smartherd.khmermusic.activities.singer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.ViewPagerAdapter
import com.smartherd.khmermusic.activities.download.DownloadActivity
import com.smartherd.khmermusic.activities.search.SearchActivity
import com.smartherd.khmermusic.activities.singer.fragments.classic_singer.ClassicSingerFragment
import com.smartherd.khmermusic.activities.singer.fragments.modern_singer.ModernSingerFragment
import com.smartherd.khmermusic.activities.singer.fragments.original_singer.OriginalSingerFragment
import com.smartherd.khmermusic.activities.song.SongActivity
import com.smartherd.khmermusic.activities.song.fragments.new_song.NewSongFragment
import com.smartherd.khmermusic.activities.song.fragments.old_song.OldSongFragment
import com.smartherd.khmermusic.activities.song.fragments.popular_song.PopularSongFragment

class SingerActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPaper: ViewPager
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singer)

        tabLayout = findViewById(R.id.singer_tabLayout)
        tabLayout.bringToFront()
        viewPaper = findViewById(R.id.singer_viewPaper)
        adapter = ViewPagerAdapter(supportFragmentManager)

        //Add Fragment
        adapter.addFragment(ClassicSingerFragment(), "Classic Singer")
        adapter.addFragment(ModernSingerFragment(), "Modern Singer")
        adapter.addFragment(OriginalSingerFragment(), "Original Singer")


        viewPaper.adapter = adapter
        tabLayout.setupWithViewPager(viewPaper)


        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.selectedItemId = R.id.singer

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.song -> {
                    val intent = Intent(applicationContext, SongActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                }
                R.id.singer -> {}
                R.id.download -> {
                    val intent = Intent(applicationContext, DownloadActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                }
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