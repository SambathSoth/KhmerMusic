package com.smartherd.khmermusic.musicplayer

import android.annotation.SuppressLint
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.os.Message
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.song.fragments.Song
import kotlinx.android.synthetic.main.activity_music_player.*

class MusicPlayerActivity : AppCompatActivity() {

    private var mp: MediaPlayer? = null
    private var totalTime: Int = 0
    private var songIndex: Int = 0
    private lateinit var song: Song
    private lateinit var songData: List<Song>
    private var songSize: Int = 0
    private var music: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_player)


        val image = intent.getIntExtra("image", 0)
        music = intent.getIntExtra("music", 0)
        val title =  intent.getStringExtra("title")
        val singer = intent.getStringExtra("singer")

//        when (intent.getStringExtra("songType")) {
//            "old_song_data" -> {
//                songData = DataProvider.old_song_data
//                songIndex = songData.indexOf(Song(image, music, title, singer))
//            }
//            "new_song_data" -> {
//                songData = com.smartherd.khmermusic.activities.song.fragments.new_song.DataProvider.new_song_data
//                songIndex = songData.indexOf(Song(image, music, title, singer))
//            }
//            "popular_song_data" -> {
//                songData = com.smartherd.khmermusic.activities.song.fragments.popular_song.DataProvider.popular_song_data
//                songIndex = songData.indexOf(Song(image, music, title, singer))
//            }
//        }

//        songSize = songData.size
//        song = songData[songIndex]

//        if (mp != null) {
//            mp!!.stop()
//            mp!!.release()
//            mp = null
//        }
//
//        mp = MediaPlayer()
//        mp = MediaPlayer.create(this, music)
//        mp!!.prepare()
//        mp!!.setOnPreparedListener {
//            mp!!.start()
//        }
        mp = MediaPlayer.create(this, music)
        mp!!.setVolume(0.5F, 0.5F)
        volumeBar.progress = 50
        positionBar.progress = 0
        totalTime = mp!!.duration

        song_title.text = title
        song_image.setImageResource(image)
        singerName.text = singer

//        if (songIndex == 0) {
//            btnBack.alpha = 0.3f
//        }
//
//        if (songIndex == songSize - 1) {
//            btnNext.alpha = 0.3f
//        }
//
//        // Next Song Button
//        btnNext.setOnClickListener {
//            if (songIndex < songSize - 1) {
//                mp.stop()
//                songIndex += 1
//
//                if (songIndex == songSize - 1) {
//                    btnNext.alpha = 0.3f
//                } else {
//                    btnNext.alpha = 1.0f
//                }
//
//                btnBack.alpha = 1.0f
//
//
//                val song = songData[songIndex]
//                mp = MediaPlayer.create(this, song.music)
//                positionBar.progress = 0
//                totalTime = mp.duration
//                singer_name.text = song.singer
//                song_title.text = song.title
//                song_image.setImageResource(song.image)
//                mp.start()
//                btnPlay.setBackgroundResource(R.drawable.ic_pause)
//                positionBar.max = totalTime
//            }
//        }
//
//        // Back Song Button
//        btnBack.setOnClickListener {
//            if (songIndex > 0) {
//                mp.stop()
//                songIndex -= 1
//
//                if (songIndex == 0) {
//                    btnBack.alpha = 0.3f
//                } else {
//                    btnBack.alpha = 1.0f
//                }
//
//                btnNext.alpha = 1.0f
//
//
//                val song = songData[songIndex]
//                mp = MediaPlayer.create(this, song.music)
//                positionBar.progress = 0
//                totalTime = mp.duration
//                singer_name.text = song.singer
//                song_title.text = song.title
//                song_image.setImageResource(song.image)
//                mp.start()
//                btnPlay.setBackgroundResource(R.drawable.ic_pause)
//                positionBar.max = totalTime
//            }
//        }
//

        //volume Bar
        volumeBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    if (fromUser) {
                        val volumeNum = progress / 100.0F
                        mp!!.setVolume(volumeNum, volumeNum)
                    }
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {}

                override fun onStopTrackingTouch(seekBar: SeekBar?) {}

            }
        )

        // Position Bar
        positionBar.max = totalTime
        positionBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    if (fromUser) {
                        mp!!.seekTo(progress)
                    }
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {}

                override fun onStopTrackingTouch(seekBar: SeekBar?) {}

            }
        )

        // Thread
        Thread(Runnable {
            while (true) {
                try {
                    val msg = Message()
                    msg.what = mp!!.currentPosition
                    handler.sendMessage(msg)
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {}
            }
        }).start()
    }

    @SuppressLint("HandlerLeak")
    var handler = object : Handler() {
        @SuppressLint("SetTextI18n")
        override fun handleMessage(msg: Message) {
            val currentPosition = msg.what

            // Update position
            positionBar.progress = currentPosition

            // Update labels
            val elapseTime = createTimeLabel(currentPosition)
            elapsedTimeLabel.text = elapseTime

            val remainingTime = createTimeLabel(totalTime - currentPosition)
            remainingTimeLabel.text = "-$remainingTime"
        }
    }

    fun createTimeLabel(time: Int) : String {
        var timeLabel = ""
        val min = time / 1000 / 60
        val sec = time / 1000 % 60

        timeLabel = "$min:"
        if (sec < 10) timeLabel += "0"
        timeLabel += "$sec"

        return timeLabel
    }

    fun playBtnClick(v: View) {
        if (mp!!.isPlaying) {
            btnPlay.setBackgroundResource(R.drawable.ic_play)
        } else {
            btnPlay.setBackgroundResource(R.drawable.ic_pause)
        }
    }

    fun volumeDown(v: View) {
        var volumeNumber = volumeBar.progress / 100.0F
        if (volumeBar.progress >= 10) {
            volumeNumber -= 0.1F
            volumeBar.progress -= 10
        } else {
            volumeNumber = 0.0F
            volumeBar.progress = 0
        }
        mp!!.setVolume(volumeNumber, volumeNumber)
    }

    fun volumeUp(v: View) {
        var volumeNumber = volumeBar.progress / 100.0F
        if (volumeBar.progress <= 90) {
            volumeNumber += 0.1F
            volumeBar.progress += 10
        } else {
            volumeNumber = 1.0F
            volumeBar.progress = 100
        }
        mp!!.setVolume(volumeNumber, volumeNumber)
    }
}