package com.metebudur.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val kahramanListesi : ArrayList<String>, val kahramanGoreslleri : ArrayList<Int>): RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recyclerViewTextView: TextView = itemView.findViewById(R.id.recyclerViewTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
         val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperKahramanVH(itemView)
    }

    override fun getItemCount(): Int {
    return kahramanListesi.size

    }

        override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {

            holder.recyclerViewTextView.text = kahramanListesi.get(position)
            holder.itemView.setOnClickListener {
                val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
                intent.putExtra("superKahramanIsmi",kahramanListesi.get(position))
                intent.putExtra("superKahramanGorselleri",kahramanGoreslleri.get(position))
/*
                val singleton = SingletonClass.SecilenKahraman
                singleton.gorsel= kahramanGoreslleri.get(position)
*/
                holder.itemView.context.startActivity(intent)
            }

        }
    }