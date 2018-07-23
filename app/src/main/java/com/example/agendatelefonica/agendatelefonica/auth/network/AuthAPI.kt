package com.example.agendatelefonica.agendatelefonica.auth.network

import com.example.agendatelefonica.agendatelefonica.auth.model.AuthUsuario
import com.example.agendatelefonica.agendatelefonica.auth.model.Usuario
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthAPI {

    @POST("auth")
    fun criarUsuario(@Body usuario: Usuario): Observable<AuthUsuario>

    @POST("auth/sign_in")
    fun login (@Body usuario: Usuario): Observable<AuthUsuario>

}