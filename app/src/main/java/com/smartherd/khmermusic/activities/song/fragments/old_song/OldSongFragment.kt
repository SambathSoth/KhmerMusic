package com.smartherd.khmermusic.activities.song.fragments.old_song

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.song.fragments.SongRecyclerViewAdapter

class OldSongFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView =  inflater.inflate(R.layout.fragment_old_song, container, false)
        setupRecyclerView(rootView)
        return rootView
    }

    private fun setupRecyclerView(rootView: View) {

        val recyclerView = rootView.findViewById(R.id.old_song_recyclerview) as RecyclerView

        val adapter = SongRecyclerViewAdapter(context, DataProvider.old_song_data, "old_song_data")
        recyclerView.adapter = adapter

        val manager = LinearLayoutManager(activity)
        manager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = manager
    }

}