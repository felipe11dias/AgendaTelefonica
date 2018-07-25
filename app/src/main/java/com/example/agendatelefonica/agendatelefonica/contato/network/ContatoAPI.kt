package com.example.agendatelefonica.agendatelefonica.contato.network

import com.example.agendatelefonica.agendatelefonica.contato.model.Contato
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ContatoAPI {

    @POST("contacts")
    fun criarContato(@Header("uid") uid: String?,
                     @Header("client") client: String?,
                     @Header("acess-token") accessToken: String?,
                     @Body contatos: Contato): Observable<Contato>

    @GET("contacts")
    fun listarContato(@Header("uid")uid: String?,
                      @Header("client")client: String?,
                      @Header("acess-token") accessToken: String?): Observable<List<Contato>>

}
