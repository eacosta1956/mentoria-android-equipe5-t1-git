package com.example.mentoria_android_t1_e5_git

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class InicialRestaurantesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicial_restaurantes)

        val restaurantCards = listOf(
            R.id.cardOutback,
            R.id.cardMcDonalds,
            R.id.cardPizzaHut,
            R.id.cardMammaJamma
            // Adicione outros IDs aqui, como R.id.cardSubway, R.id.cardBurgerKing etc.
        )

        restaurantCards.forEach { id ->
            findViewById<LinearLayout>(R.id.cardOutback).setOnClickListener {
                val intent = Intent(this, DetalhesRestauranteActivity::class.java)
                startActivity(intent)
            }
        }
    }
}