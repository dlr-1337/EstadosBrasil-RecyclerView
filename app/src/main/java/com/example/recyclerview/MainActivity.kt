package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerEstados = findViewById<RecyclerView>(R.id.recyclerEstados)
        val listaEstados = EstadosRepository.obterEstados()

        // Usa um layout em lista vertical simples, como mostrado nas aulas.
        recyclerEstados.layoutManager = LinearLayoutManager(this)
        // Liga o adapter e trata o clique para abrir a tela de detalhes.
        recyclerEstados.adapter = EstadoAdapter(listaEstados) { estadoSelecionado ->
            abrirDetalhes(estadoSelecionado)
        }
    }

    private fun abrirDetalhes(estado: Estado) {
        val intent = Intent(this, DetalheEstadoActivity::class.java)
        intent.putExtra(DetalheEstadoActivity.EXTRA_ESTADO, estado)
        startActivity(intent)
    }
}
