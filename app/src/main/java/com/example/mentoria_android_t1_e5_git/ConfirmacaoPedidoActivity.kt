package com.example.mentoria_android_t1_e5_git


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ConfirmacaoPedidoActivity : AppCompatActivity() {

    private lateinit var btnVoltar: ImageButton
    private lateinit var btnConfirmarPedido: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacao_pedido)

        // Inicialização correta dos botões
        btnVoltar = findViewById(R.id.btnVoltar)
        btnConfirmarPedido = findViewById(R.id.btnConfirmarPedido)

        // Ação do botão Voltar
        btnVoltar.setOnClickListener {
            finish()
        }

        // Ação do botão Confirmar Pedido
        btnConfirmarPedido.setOnClickListener {
            val intent = Intent(this, InicialRestaurantesActivity::class.java)
            startActivity(intent)
        }
    }
}
