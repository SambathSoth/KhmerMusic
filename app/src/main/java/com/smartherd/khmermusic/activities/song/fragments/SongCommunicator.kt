package com.smartherd.khmermusic.activities.song.fragments

interface SongCommunicator {
    fun playSong(image: Int, music: Int, title: String, singer: String, song_type: String)
}