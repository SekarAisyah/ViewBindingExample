package com.example.viewbindingexample.vmrecyclerviewfilm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindingexample.R
import java.util.ArrayList

class FilmAdapter(var listFilm : ArrayList<DataFilm>):RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var img = itemView.findViewById<ImageView>(R.id.filmImg)
        var name = itemView.findViewById<TextView>(R.id.filmName)
        var tgl = itemView.findViewById<TextView>(R.id.tglFilm)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        var data = listFilm[position]
        holder.img.setImageResource(data.img)
        holder.name.text = data.name
        holder.tgl.text = data.tgl

    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    fun setFilmData(listFilm: ArrayList<DataFilm>)
    {
        this.listFilm=listFilm

    }
}