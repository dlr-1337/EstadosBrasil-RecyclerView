package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalheEstadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_estado)

        @Suppress("DEPRECATION")
        val estado = intent.getSerializableExtra(EXTRA_ESTADO) as? Estado

        // Se algo der errado com o dado enviado, fechamos a tela para evitar erros.
        if (estado == null) {
            finish()
            return
        }

        val imagemBandeira = findViewById<ImageView>(R.id.imageDetalheBandeira)
        val textoNome = findViewById<TextView>(R.id.textDetalheNome)
        val textoCapital = findViewById<TextView>(R.id.textDetalheCapital)
        val textoPopulacao = findViewById<TextView>(R.id.textDetalhePopulacao)
        val textoRegiao = findViewById<TextView>(R.id.textDetalheRegiao)

        // Mostra todas as informações básicas basicas dos estados.
        imagemBandeira.setImageResource(estado.bandeiraResId)
        textoNome.text = estado.nome
        textoCapital.text = getString(R.string.texto_capital, estado.capital)
        textoPopulacao.text = getString(R.string.texto_populacao, estado.populacao)
        textoRegiao.text = getString(R.string.texto_regiao, estado.regiao)
    }

    companion object {
        const val EXTRA_ESTADO = "extra_estado"
    }
}
