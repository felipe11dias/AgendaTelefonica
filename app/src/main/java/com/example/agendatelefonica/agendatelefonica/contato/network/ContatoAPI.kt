package com.example.agendatelefonica.agendatelefonica.contato.network

import com.example.agendatelefonica.agendatelefonica.contato.model.Contato
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ContatoAPI {

    @POST("contatos")
    fun criarContato(@Header("uid") uid: String,
                     @Header("client") client: String,
                     @Header("acess-token") acessToken: String,
                     @Body contatos: Contato): Observable<Contato>

    @GET("contatos")
    fun listarContato(@Header("uid")uid: String,
                    @Header("client")client: String,
                    @Header("acess-token") acessToken: String): Observable<List<Contato>>

}
