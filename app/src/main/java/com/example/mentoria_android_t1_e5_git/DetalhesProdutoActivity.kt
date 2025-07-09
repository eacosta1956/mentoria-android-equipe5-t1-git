package com.example.mentoria_android_t1_e5_git

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class DetalhesProdutoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detalhes_produto)

        val botaoConfirmar = findViewById<Button>(R.id.btnConfirmar)
        botaoConfirmar.setOnClickListener {
            val intent = Intent(this, ConfirmacaoPedidoActivity::class.java)
            startActivity(intent)
        }

        val botaoVoltar = findViewById<ImageButton>(R.id.btnVoltar)
        botaoVoltar.setOnClickListener {
            val intent = Intent(this, DetalhesRestauranteActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}