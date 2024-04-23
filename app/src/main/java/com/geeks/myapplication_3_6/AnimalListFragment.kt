package com.geeks.myapplication_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AnimalListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var animalAdapter :AnimalAdapter
    private lateinit var animalList: List<Animal>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_animal_list, container, false)

        recyclerView = rootView.findViewById(R.id.rv_animal)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        animalList = generateAnimalList()

        animalAdapter = AnimalAdapter(animalList)
        recyclerView.adapter = animalAdapter

        return rootView
    }

    private fun generateAnimalList(): List<Animal> {
        val animal = mutableListOf<Animal>()
        animal.add(Animal("Cat", "https://images.pexels.com/photos/104827/cat-pet-animal-domestic-104827.jpeg?cs=srgb&dl=pexels-pixabay-104827.jpg&fm=jpg"))
        animal.add(Animal("Dog", "https://img.freepik.com/premium-photo/cute-dog-jpg_1072857-373.jpg"))
        animal.add(Animal("Lion", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQavChZxUod9yRPQaAU4y56UPrZa_3YdonPsQ&s"))
        animal.add(Animal("Cow", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYOerVEJXUZHBx_-YU6pNayHf1JDoliEa1YQ&s"))
        animal.add(Animal("Horse", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqjaIadqjMyMpbNkaa3eoFvZzWiqMWuJaxww&s"))
        animal.add(Animal("Donkey", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyk2KYyuxROFg3xz_zFdyygtI_oTGhtb4_RA&s"))
        animal.add(Animal("Fox", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLQ8iLd00idMo_VX-xnMMtysk8jpo6e2kYXA&s"))
        animal.add(Animal("Goat", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGp-qoNmUlPqQtvTux-f_tb0L9KTSGbW8Zrg&s"))
        animal.add(Animal("Bear", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTL316nHlEOZZmJdFzleqJqVzv2SLmlvmz6w&s"))
        return animal
    }

}