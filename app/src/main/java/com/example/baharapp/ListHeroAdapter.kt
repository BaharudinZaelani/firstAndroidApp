package com.example.baharapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.size
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapter( private val listHero: ArrayList<HeroIndonesia> ) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listHero.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val ( name, photo, description ) = listHero[position]
        holder.heroPhoto.setImageResource(photo.toInt())
        holder.heroName.text = name
        holder.heroDescription.text = description.toString()
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val heroPhoto: ImageView = itemView.findViewById(R.id.heroPhoto)
        val heroName: TextView = itemView.findViewById(R.id.heroName)
        val heroDescription: TextView = itemView.findViewById(R.id.heroDescription)
    }

}
