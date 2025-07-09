package com.example.mentoria_android_t1_e5_git

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class DetalhesRestauranteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_restaurante)

        // Botão de voltar (imagem circular)
        val btnVoltar = findViewById<ImageView>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            val intent = Intent(this, InicialRestaurantesActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }

        // Clique no Produto 1
        val layoutProduto1 = findViewById<LinearLayout>(R.id.layoutProduto1)
        layoutProduto1.setOnClickListener {
            val intent = Intent(this, DetalhesProdutoActivity::class.java)
            intent.putExtra("nome", "Big Five")
            intent.putExtra("descricao", "Os cinco aperitivos mais pedidos da casa")
            intent.putExtra("preco", "R$ 89,90")
            startActivity(intent)
        }

        // Clique no Produto 2
        val layoutProduto2 = findViewById<LinearLayout>(R.id.layoutProduto2)
        layoutProduto2.setOnClickListener {
            val intent = Intent(this, DetalhesProdutoActivity::class.java)
            intent.putExtra("nome", "Hamburguer da Casa")
            intent.putExtra("descricao", "Hamburguer com batata especial da casa")
            intent.putExtra("preco", "R$ 55,70")
            startActivity(intent)
        }
    }
}
