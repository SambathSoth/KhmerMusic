package com.smartherd.khmermusic.activities.singer.fragments.modern_singer

import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.singer.fragments.Singer

object DataProvider {
    val modern_singer_data: List<Singer>
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
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary,
            R.drawable.khem,
            R.drawable.ton_chan_sey_ma,
            R.drawable.ouk_savannary
        )

    private val names: Array<String>
        get() = arrayOf(
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary",
            "Khem",
            "Ton ChanSeyMa",
            "Ouk Sovannary"
        )
}