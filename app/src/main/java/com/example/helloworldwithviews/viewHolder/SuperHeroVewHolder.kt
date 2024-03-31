package com.example.helloworldwithviews.viewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.helloworldwithviews.R
import com.example.helloworldwithviews.superHeroModel.SuperHeroModel

class SuperHeroVewHolder(val view: View):RecyclerView.ViewHolder(view) {
    val name = view.findViewById<TextView>(R.id.SuperHeroName)
    val author = view.findViewById<TextView>(R.id.SuperHeroAuthor)
    val image = view.findViewById<ImageView>(R.id.superHeroImageView)

    fun render(model:  SuperHeroModel){
        name.text = model.name
        author.text = model.author
        Glide.with(image.context).load(model.imageUrl).into(image)
    }
}