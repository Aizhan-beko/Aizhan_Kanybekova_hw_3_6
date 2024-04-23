package com.geeks.myapplication_3_6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AnimalAdapter(private val animalList: List<Animal>):RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_animal, parent, false)
        return AnimalViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animalList[position]
        holder.bind(animal)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val animal_img: ImageView = itemView.findViewById(R.id.animal_img)
        var tv_name: TextView = itemView.findViewById(R.id.tv_name)

        fun bind(animal: Animal) {
            Glide.with(itemView)
                .load(animal.imageUrl)
                .into(animal_img)
            tv_name.text = animal.name

        }
    }
}