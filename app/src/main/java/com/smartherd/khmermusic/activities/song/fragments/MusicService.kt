package com.smartherd.khmermusic.activities.song.fragments

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MusicService : Service() {

    var mp: MediaPlayer? = null

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
    }



    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val music = intent!!.getIntExtra("music", 0)

        if (mp != null) {
            mp!!.stop()
            mp!!.release()
            mp = null
        }

        mp = MediaPlayer()
        mp = MediaPlayer.create(this, music)
        mp!!.setOnPreparedListener {
            mp!!.start()
        }
        return super.onStartCommand(intent, flags, startId)
    }
}
