package com.example.agendatelefonica.agendatelefonica.contato.business

import com.example.agendatelefonica.agendatelefonica.auth.model.Usuario
import com.example.agendatelefonica.agendatelefonica.contato.database.ContatoDatabase
import com.example.agendatelefonica.agendatelefonica.contato.model.Contato
import com.example.agendatelefonica.agendatelefonica.contato.network.ContatoNetwork

object ContatoBusiness {

    fun listarContato(): List<Contato> {
        var contatos: List<Contato> = listOf()
        ContatoDatabase.listarContato()

        return contatos
    }


    fun criarContato(contato: Contato, onSuccess: () -> Unit, onError:() -> Unit){
        ContatoNetwork.criarContato(contato, {
            ContatoDatabase.salvarContato(contato){
                onSuccess()
            }
        }, {
            onError()
        })
    }


}