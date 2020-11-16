package com.smartherd.khmermusic.activities.singer.fragments.original_singer

import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.singer.fragments.Singer

object DataProvider {
    val original_singer_data: List<Singer>
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
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng,
            R.drawable.adda,
            R.drawable.tena,
            R.drawable.sully_pheng

            )

    private val names: Array<String>
        get() = arrayOf(
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng",
            "Adda",
            "Tena",
            "Sully Pheng"
        )
}