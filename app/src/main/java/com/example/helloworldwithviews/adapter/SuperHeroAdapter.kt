package com.example.helloworldwithviews.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworldwithviews.R
import com.example.helloworldwithviews.superHeroModel.SuperHeroModel
import com.example.helloworldwithviews.viewHolder.SuperHeroVewHolder

class SuperHeroAdapter(var superHeroList: List<SuperHeroModel>) : RecyclerView.Adapter<SuperHeroVewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroVewHolder(layoutInflater.inflate(R.layout.item_superhero_cell, parent, false))
    }

    override fun getItemCount(): Int = superHeroList.size

    override fun onBindViewHolder(holder: SuperHeroVewHolder, position: Int) {
        var item = superHeroList[position]
        holder.render(item)

    }
}