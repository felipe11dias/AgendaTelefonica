package com.example.agendatelefonica.agendatelefonica.auth.business

import com.example.agendatelefonica.agendatelefonica.R
import com.example.agendatelefonica.agendatelefonica.auth.database.AuthDatabase
import com.example.agendatelefonica.agendatelefonica.auth.model.Usuario
import com.example.agendatelefonica.agendatelefonica.auth.network.AuthNetwork


object AuthBusiness {

    fun login(usuario: Usuario, onSuccess: ()-> Unit, onError:(message: Int) -> Unit){

        AuthNetwork.login(usuario, {
            AuthDatabase.salvarLogin(it){
                onSuccess()
            }
        }, {
            onError(R.string.erro_busca_usuario)
        })

    }

    fun criarUsuario(usuario: Usuario,onSuccess: () -> Unit,onError: (message: Int) -> Unit){
        AuthNetwork.criarUsuario(usuario,{
            onSuccess()
        }, {
            onError(R.string.erro_criar_conta)
        })
    }

}