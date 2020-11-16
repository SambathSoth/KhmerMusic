package com.smartherd.khmermusic.activities.song.fragments.old_song

import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.song.fragments.Song

object DataProvider {
    val old_song_data: List<Song>
        get() {
            val dataList = ArrayList<Song>()
            for (i in images.indices) {
                val song =
                    Song(
                        images[i],
                        music[i],
                        title[i],
                        singer[i]
                    )
                dataList.add(song)
            }
            return dataList
        }

    private val images: IntArray
        get() = intArrayOf(
            R.drawable.sin_sinsamuth_kom_pong_thom_jum_rum_jet,
            R.drawable.keo_sarath_moha_sror_nos,
            R.drawable.meng_keo_pechchenda_kyong_kdok,
            R.drawable.sin_sisamuth_tom_nour_pay_len,
            R.drawable.sin_sinsamuth_kom_pong_thom_jum_rum_jet,
            R.drawable.keo_sarath_moha_sror_nos,
            R.drawable.meng_keo_pechchenda_kyong_kdok,
            R.drawable.sin_sisamuth_tom_nour_pay_len,
            R.drawable.sin_sinsamuth_kom_pong_thom_jum_rum_jet,
            R.drawable.keo_sarath_moha_sror_nos,
            R.drawable.meng_keo_pechchenda_kyong_kdok,
            R.drawable.sin_sisamuth_tom_nour_pay_len,
            R.drawable.sin_sinsamuth_kom_pong_thom_jum_rum_jet,
            R.drawable.keo_sarath_moha_sror_nos,
            R.drawable.meng_keo_pechchenda_kyong_kdok,
            R.drawable.sin_sisamuth_tom_nour_pay_len,
            R.drawable.sin_sinsamuth_kom_pong_thom_jum_rum_jet,
            R.drawable.keo_sarath_moha_sror_nos,
            R.drawable.meng_keo_pechchenda_kyong_kdok,
            R.drawable.sin_sisamuth_tom_nour_pay_len,
            R.drawable.sin_sinsamuth_kom_pong_thom_jum_rum_jet,
            R.drawable.keo_sarath_moha_sror_nos,
            R.drawable.meng_keo_pechchenda_kyong_kdok,
            R.drawable.sin_sisamuth_tom_nour_pay_len
        )

    private val music: IntArray
        get() = intArrayOf(
            R.raw.kom_pong_thom_jum_rum_jet,
            R.raw.moha_sro_nos,
            R.raw.kyong_kdok,
            R.raw.tum_nour_pay_lin,
            R.raw.kom_pong_thom_jum_rum_jet,
            R.raw.moha_sro_nos,
            R.raw.kyong_kdok,
            R.raw.tum_nour_pay_lin,
            R.raw.kom_pong_thom_jum_rum_jet,
            R.raw.moha_sro_nos,
            R.raw.kyong_kdok,
            R.raw.tum_nour_pay_lin,
            R.raw.kom_pong_thom_jum_rum_jet,
            R.raw.moha_sro_nos,
            R.raw.kyong_kdok,
            R.raw.tum_nour_pay_lin,
            R.raw.kom_pong_thom_jum_rum_jet,
            R.raw.moha_sro_nos,
            R.raw.kyong_kdok,
            R.raw.tum_nour_pay_lin,
            R.raw.kom_pong_thom_jum_rum_jet,
            R.raw.moha_sro_nos,
            R.raw.kyong_kdok,
            R.raw.tum_nour_pay_lin
        )
    private val title: Array<String>
        get() = arrayOf(
            "Kom Pong Thom Jum Rum Jet",
            "Moha Sro Nos",
            "Kyong Kdok",
            "Tum Nour Pay Len",
            "Kom Pong Thom Jum Rum Jet",
            "Moha Sro Nos",
            "Kyong Kdok",
            "Tum Nour Pay Len",
            "Kom Pong Thom Jum Rum Jet",
            "Moha Sro Nos",
            "Kyong Kdok",
            "Tum Nour Pay Len",
            "Kom Pong Thom Jum Rum Jet",
            "Moha Sro Nos",
            "Kyong Kdok",
            "Tum Nour Pay Len",
            "Kom Pong Thom Jum Rum Jet",
            "Moha Sro Nos",
            "Kyong Kdok",
            "Tum Nour Pay Len",
            "Kom Pong Thom Jum Rum Jet",
            "Moha Sro Nos",
            "Kyong Kdok",
            "Tum Nour Pay Len"
        )

    private val singer: Array<String>
        get() = arrayOf(
            "Sin Sisamuth",
            "Keo Sarath",
            "Meng Keo Pech Chenda",
            "Sin Sisamuth",
            "Sin Sisamuth",
            "Keo Sarath",
            "Meng Keo Pech Chenda",
            "Sin Sisamuth",
            "Sin Sisamuth",
            "Keo Sarath",
            "Meng Keo Pech Chenda",
            "Sin Sisamuth",
            "Sin Sisamuth",
            "Keo Sarath",
            "Meng Keo Pech Chenda",
            "Sin Sisamuth",
            "Sin Sisamuth",
            "Keo Sarath",
            "Meng Keo Pech Chenda",
            "Sin Sisamuth",
            "Sin Sisamuth",
            "Keo Sarath",
            "Meng Keo Pech Chenda",
            "Sin Sisamuth"
        )
}