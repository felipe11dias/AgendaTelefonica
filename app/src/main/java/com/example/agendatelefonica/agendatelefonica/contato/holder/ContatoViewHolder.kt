package com.example.agendatelefonica.agendatelefonica.contato.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.agendatelefonica.agendatelefonica.contato.model.Contato
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_criar_editar_contato.*
import kotlinx.android.synthetic.main.activity_criar_editar_contato.view.*


class ContatoViewHolder(val view: View) : RecyclerView.ViewHolder(view){


    fun bind(contato: Contato){

        with(view) {


            text_nome_contato.text = contato.name
            text_email_contato.text = contato.email
            text_telefone_contato.text = contato.phone
            text_datanascimento_cotato.text.toString().toLong() = contato.birth
            Picasso.get().load(contato.picture).into(image_contato)



        }
    }

}