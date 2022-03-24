package com.example.android.dessertpusher.screens.main

import androidx.lifecycle.ViewModel
import com.example.android.dessertpusher.R

class MainViewModel : ViewModel() {
     var revenue = 0
     var dessertsSold = 0

     fun onDessertClicked() {

        // Update the score
        revenue += currentDessert.price
        dessertsSold++


        // Show the next dessert
//        showCurrentDessert()
    }
     val allDesserts = listOf(
        Dessert(R.drawable.cupcake, 5, 0),
        Dessert(R.drawable.donut, 10, 5),
        Dessert(R.drawable.eclair, 15, 20),
        Dessert(R.drawable.froyo, 30, 50),
        Dessert(R.drawable.gingerbread, 50, 100),
        Dessert(R.drawable.honeycomb, 100, 200),
        Dessert(R.drawable.icecreamsandwich, 500, 500),
        Dessert(R.drawable.jellybean, 1000, 1000),
        Dessert(R.drawable.kitkat, 2000, 2000),
        Dessert(R.drawable.lollipop, 3000, 4000),
        Dessert(R.drawable.marshmallow, 4000, 8000),
        Dessert(R.drawable.nougat, 5000, 16000),
        Dessert(R.drawable.oreo, 6000, 20000)
    )
    var currentDessert = allDesserts[0]
    data class Dessert(val imageId: Int, val price: Int, val startProductionAmount: Int)

}