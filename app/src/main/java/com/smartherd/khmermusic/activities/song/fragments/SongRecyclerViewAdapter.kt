package com.smartherd.khmermusic.activities.song.fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.smartherd.khmermusic.R
import kotlinx.android.synthetic.main.item_song.view.*

class SongRecyclerViewAdapter(private val context: Context?, private val songs: List<Song>, private val song_type: String) : RecyclerView.Adapter<SongRecyclerViewAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private lateinit var current: Song

        fun setData(current_song: Song) {
            itemView.image_singer.setImageResource(current_song.image)
            itemView.title.text = current_song.title
            itemView.singer.text = current_song.singer
            this.current = current_song
        }

        fun setListener() {
            itemView.setOnClickListener {
                val songCommunicator = context as SongCommunicator
                songCommunicator.playSong(current.image, current.music, current.title, current.singer, song_type)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.item_song, parent, false)
        return MyViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val current = songs[position]
        holder.setData(current)
        holder.setListener()
    }
}