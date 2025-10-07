package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EstadoAdapter(
    private val estados: List<Estado>,
    private val onItemClick: (Estado) -> Unit
) : RecyclerView.Adapter<EstadoAdapter.EstadoViewHolder>() {

    // Infla o layout do item quando um novo item precisa aparecer na tela.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstadoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_estado, parent, false)
        return EstadoViewHolder(view)
    }

    override fun onBindViewHolder(holder: EstadoViewHolder, position: Int) {
        val estado = estados[position]
        holder.bind(estado)
        holder.itemView.setOnClickListener { onItemClick(estado) }
    }

    override fun getItemCount(): Int = estados.size

    class EstadoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imagemBandeira: ImageView = itemView.findViewById(R.id.imageBandeira)
        private val textoNome: TextView = itemView.findViewById(R.id.textNomeEstado)

        fun bind(estado: Estado) {
            // Preenche a imagem e o texto do item com os dados do estado.
            imagemBandeira.setImageResource(estado.bandeiraResId)
            textoNome.text = estado.nome
        }
    }
}
