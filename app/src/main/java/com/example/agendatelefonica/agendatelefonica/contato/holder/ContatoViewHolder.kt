package com.example.agendatelefonica.agendatelefonica.contato.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.agendatelefonica.agendatelefonica.contato.model.Contato
import kotlinx.android.synthetic.main.activity_criar_editar_contato.view.*

class ContatoViewHolder(val view: View) : RecyclerView.ViewHolder(view){

    fun bind(contato: Contato){

        with(view) {
            contato.name = edit_nome_contato.text.toString()
            contato.email = edit_email_contato.text.toString()
            contato.telefone = edit_telefone_contato.text.toString()
            contato.avatarUrl = edit_url_imagem_contato.text.toString()
        }
    }

}