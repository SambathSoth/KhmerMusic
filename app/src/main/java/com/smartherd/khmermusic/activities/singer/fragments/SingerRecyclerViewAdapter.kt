package com.smartherd.khmermusic.activities.singer.fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.smartherd.khmermusic.R
import kotlinx.android.synthetic.main.item_singer.view.*

class SingerRecyclerViewAdapter(private val context: Context?, private val singers: List<Singer>): RecyclerView.Adapter<SingerRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun setData(current_singer: Singer) {
            itemView.singer_image.setImageResource(current_singer.photo)
            itemView.singer_name.text = current_singer.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.item_singer, parent, false)
        return MyViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return singers.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val current = singers[position]
        holder.setData(current)
    }
}