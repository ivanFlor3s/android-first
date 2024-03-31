package com.example.helloworldwithviews

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworldwithviews.adapter.SuperHeroAdapter
import com.example.helloworldwithviews.superHeroModel.SuperHeroModel
import com.example.helloworldwithviews.superHeroProvider.SuperHeroProvider

class MainActivity : AppCompatActivity() {

    val superHero = SuperHeroModel(
        "Ivan",
        "Marvel",
        "httop..."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initRecycleView()
    }

    fun initRecycleView(){
        var recycleView = findViewById<RecyclerView>(R.id.superHeroRecyclerView)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = SuperHeroAdapter(SuperHeroProvider.heroesList)
    }
}