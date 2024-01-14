package com.metebudur.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

import com.metebudur.superkahramankitabi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        var SuperKahramnIsimleri = ArrayList<String>()
        SuperKahramnIsimleri.add("Batman")
        SuperKahramnIsimleri.add("Superman")
        SuperKahramnIsimleri.add("Iron man")
        SuperKahramnIsimleri.add("Aquman")
        SuperKahramnIsimleri.add("Spiderman")


        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val ironmanDrawableId = R.drawable.fdfgg
        val aqumanDrawableId = R.drawable.asdas
        val spidermanDrawableId = R.drawable.spiderman

        val superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(aqumanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(SuperKahramnIsimleri,superKahramanDrawableListesi)

        binding.recyclerView.adapter = adapter

    }
}