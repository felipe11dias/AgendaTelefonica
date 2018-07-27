package com.example.agendatelefonica.agendatelefonica.contato.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.agendatelefonica.agendatelefonica.R
import com.example.agendatelefonica.agendatelefonica.contato.business.ContatoBusiness
import com.example.agendatelefonica.agendatelefonica.contato.holder.ContatoViewHolder
import com.example.agendatelefonica.agendatelefonica.contato.model.Contato

class ContatoAdapter : RecyclerView.Adapter<ContatoViewHolder>() {

    val listaContatos: List<Contato> = ContatoBusiness.listarContato()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.linha_recyclerview, parent, false)



        return ContatoViewHolder(view)
    }

    override fun getItemCount(): Int = listaContatos.size

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        holder.bind(listaContatos[position])
    }

}