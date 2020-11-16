package com.smartherd.khmermusic.activities.song

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.ViewPagerAdapter
import com.smartherd.khmermusic.activities.download.DownloadActivity
import com.smartherd.khmermusic.activities.search.SearchActivity
import com.smartherd.khmermusic.activities.singer.SingerActivity
import com.smartherd.khmermusic.activities.song.fragments.MusicService
import com.smartherd.khmermusic.activities.song.fragments.new_song.NewSongFragment
import com.smartherd.khmermusic.activities.song.fragments.SongCommunicator
import com.smartherd.khmermusic.activities.song.fragments.old_song.OldSongFragment
import com.smartherd.khmermusic.activities.song.fragments.popular_song.PopularSongFragment
import com.smartherd.khmermusic.musicplayer.MusicPlayerActivity

class SongActivity:  AppCompatActivity(),
    SongCommunicator {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPaper: ViewPager
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song)

        tabLayout = findViewById(R.id.song_tabLayout)
        tabLayout.bringToFront()
        viewPaper = findViewById(R.id.song_viewPaper)
        adapter = ViewPagerAdapter(
            supportFragmentManager
        )

        //Add Fragment
        adapter.addFragment(PopularSongFragment(), "Popular Song")
        adapter.addFragment(NewSongFragment(), "New Song")
        adapter.addFragment(OldSongFragment(), "Old Song")


        viewPaper.adapter = adapter
        tabLayout.setupWithViewPager(viewPaper)


        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.selectedItemId = R.id.song

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.song -> {}
                R.id.singer -> {
                    val intent = Intent(applicationContext, SingerActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                }
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

    override fun playSong(image: Int, music: Int, title: String, singer: String, song_type: String) {

        val intent = Intent(this, MusicPlayerActivity::class.java)
        intent.putExtra("image", image)
        intent.putExtra("music", music)
        intent.putExtra("title", title)
        intent.putExtra("singer", singer)
        intent.putExtra("songType", song_type)
        startActivity(intent)

        val musicIntent = Intent(this, MusicService::class.java)
        musicIntent.putExtra("music", music)
        startService(musicIntent)
    }

}
