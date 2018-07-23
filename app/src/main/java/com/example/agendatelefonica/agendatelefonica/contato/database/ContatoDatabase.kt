package com.example.agendatelefonica.agendatelefonica.contato.database

import com.example.agendatelefonica.agendatelefonica.contato.model.Contato
import io.realm.Realm

object ContatoDatabase {

    fun salvarContato(contatos: Contato, onSuccess: () -> Unit){

        Realm.getDefaultInstance().use {
            it.beginTransaction()
            it.copyToRealm(contatos)
            it.commitTransaction()

            onSuccess()

        }
    }

    fun listarContato(): List<Contato> {
        var contatos: List<Contato> = listOf()

        Realm.getDefaultInstance().use {
            contatos = it.where(Contato::class.java).findAll()
        }
        return contatos
    }
}
