package com.smartherd.khmermusic.activities.singer.fragments.modern_singer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.smartherd.khmermusic.R
import com.smartherd.khmermusic.activities.singer.fragments.SingerRecyclerViewAdapter
import com.smartherd.khmermusic.activities.song.fragments.SongRecyclerViewAdapter

class ModernSingerFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_modern_singer, container, false)
        setupRecyclerView(rootView)
        return rootView
    }

    private fun setupRecyclerView(rootView: View) {
        val recyclerView = rootView.findViewById(R.id.modern_singer_recyclerview) as RecyclerView

        val adapter = SingerRecyclerViewAdapter(context, DataProvider.modern_singer_data)
        recyclerView.adapter = adapter

        val gridLayoutManager = GridLayoutManager(context, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)
    }
}