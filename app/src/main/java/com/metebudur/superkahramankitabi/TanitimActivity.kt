package com.metebudur.superkahramankitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metebudur.superkahramankitabi.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTanitimBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent
        val secilenKahramanIsmi = intent.getStringExtra("superKahramanIsmi")
        binding.textView.text = secilenKahramanIsmi

        val secilenKahramanGorseli = intent.getIntExtra("superKahramanGorselleri",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenKahramanGorseli)
        binding.imageView.setImageBitmap(bitmap)


    /*
        val secilenKahraman = SingletonClass.SecilenKahraman
        val secilenGorsel = secilenKahraman.gorsel
        binding.imageView.setImageBitmap(secilenGorsel)*/
    }
}