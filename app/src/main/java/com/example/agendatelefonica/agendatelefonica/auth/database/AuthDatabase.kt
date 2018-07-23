package com.example.agendatelefonica.agendatelefonica.auth.database


import com.example.agendatelefonica.agendatelefonica.auth.model.Usuario
import io.realm.Realm

object AuthDatabase {

    fun salvarLogin(usuario: Usuario, onSuccess: () -> Unit){

        Realm.getDefaultInstance().use { realm ->

            realm.beginTransaction()
            realm.deleteAll()
            realm.copyToRealm(usuario)
            realm.commitTransaction()
            onSuccess()

        }

    }

    fun salvarUsuario(usuario: Usuario,onSuccess: () -> Unit){

        Realm.getDefaultInstance().use { realm ->

            realm.beginTransaction()
            realm.copyToRealm(usuario)
            realm.commitTransaction()
            onSuccess()

        }
    }
}