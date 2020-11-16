package com.smartherd.khmermusic.activities.song.fragments.popular_song

import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.song.fragments.Song


object DataProvider {
    val popular_song_data: List<Song>
        get() {
            val dataList = ArrayList<Song>()
            for (i in images.indices) {
                val song = Song(
                    images[i],
                    music[i],
                    title[i],
                    singer[i])
                dataList.add(song)
            }
            return dataList
        }

    private val images: IntArray
        get() = intArrayOf(
            R.drawable.image_arom_sad,
            R.drawable.image_single_dol_ngab,
            R.drawable.image_songsa_bong_jrern,
            R.drawable.image_hit_on_the_road,
            R.drawable.ok_i_know,
            R.drawable.image_arom_sad,
            R.drawable.image_single_dol_ngab,
            R.drawable.image_songsa_bong_jrern,
            R.drawable.image_hit_on_the_road,
            R.drawable.ok_i_know,
            R.drawable.image_arom_sad,
            R.drawable.image_single_dol_ngab,
            R.drawable.image_songsa_bong_jrern,
            R.drawable.image_hit_on_the_road,
            R.drawable.ok_i_know,
            R.drawable.image_arom_sad,
            R.drawable.image_single_dol_ngab,
            R.drawable.image_songsa_bong_jrern,
            R.drawable.image_hit_on_the_road,
            R.drawable.ok_i_know
        )

    private val music: IntArray
        get() = intArrayOf(
            R.raw.arom_sad,
            R.raw.single_dol_ngab,
            R.raw.songsa_bong_jrern,
            R.raw.hit_on_the_road,
            R.raw.ok_i_know,
            R.raw.arom_sad,
            R.raw.single_dol_ngab,
            R.raw.songsa_bong_jrern,
            R.raw.hit_on_the_road,
            R.raw.ok_i_know,
            R.raw.arom_sad,
            R.raw.single_dol_ngab,
            R.raw.songsa_bong_jrern,
            R.raw.hit_on_the_road,
            R.raw.ok_i_know,
            R.raw.arom_sad,
            R.raw.single_dol_ngab,
            R.raw.songsa_bong_jrern,
            R.raw.hit_on_the_road,
            R.raw.ok_i_know
        )

    private val title: Array<String>
        get() = arrayOf(
            "Arom Sad",
            "Single Dol Ngab",
            "Songsa Bong Jrern",
            "Hit ON the Road",
            "Ok I Know",
            "Arom Sad",
            "Single Dol Ngab",
            "Songsa Bong Jrern",
            "Hit ON the Road",
            "Ok I Know",
            "Arom Sad",
            "Single Dol Ngab",
            "Songsa Bong Jrern",
            "Hit ON the Road",
            "Ok I Know",
            "Arom Sad",
            "Single Dol Ngab",
            "Songsa Bong Jrern",
            "Hit ON the Road",
            "Ok I Know"
        )

    private val singer: Array<String>
        get() = arrayOf(
            "Ton ChanSeyma",
            "Ouk Sovannary",
            "Tena",
            "Vannda",
            "Ton ChanSeyma",
            "Ton ChanSeyma",
            "Ouk Sovannary",
            "Tena",
            "Vannda",
            "Ton ChanSeyma",
            "Ton ChanSeyma",
            "Ouk Sovannary",
            "Tena",
            "Vannda",
            "Ton ChanSeyma",
            "Ton ChanSeyma",
            "Ouk Sovannary",
            "Tena",
            "Vannda",
            "Ton ChanSeyma"
        )
}