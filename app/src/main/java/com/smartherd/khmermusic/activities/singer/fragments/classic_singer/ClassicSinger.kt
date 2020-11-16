package com.smartherd.khmermusic.activities.singer.fragments.classic_singer

import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.singer.fragments.Singer

object DataProvider {
    val classic_singer_data: List<Singer>
        get() {
            val dataList = ArrayList<Singer>()

            for (i in photos.indices) {
                val singer = Singer(photos[i], names[i])
                dataList.add(singer)
            }
            return dataList
        }

    private val photos: IntArray
        get() = intArrayOf(
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea,
            R.drawable.sin_si_samuth,
            R.drawable.keo_sarath,
            R.drawable.rous_serey_sothea
        )

    private val names: Array<String>
        get() = arrayOf(
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea",
            "Sin Sisamuth",
            "Keo Sarath",
            "Rous Serey Sothea"
        )
}