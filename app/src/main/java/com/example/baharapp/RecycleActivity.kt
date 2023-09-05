package com.example.baharapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleActivity: AppCompatActivity() {
    private lateinit var heroes: RecyclerView
    private var list = ArrayList<HeroIndonesia>()

    fun constructor() {
        heroes = findViewById(R.id.containerHeroes)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_recycle)
        constructor()

        heroes.setHasFixedSize(true)
        list.addAll(getListHero())
        showRecyclerList()

    }

    private fun showRecyclerList() {
        heroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        heroes.adapter = listHeroAdapter
    }

    private fun getListHero(): ArrayList<HeroIndonesia> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listHero = ArrayList<HeroIndonesia>()
        for ( i in dataName.indices ) {
            val hero = HeroIndonesia(dataName[i], dataPhoto.getResourceId(i, -1), dataDescription[i])
            listHero.add(hero)
        }
        return listHero
    }
}