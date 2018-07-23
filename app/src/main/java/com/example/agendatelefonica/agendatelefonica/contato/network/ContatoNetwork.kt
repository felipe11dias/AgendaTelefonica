package com.example.agendatelefonica.agendatelefonica.contato.network

import com.example.agendatelefonica.agendatelefonica.auth.model.Usuario
import com.example.agendatelefonica.agendatelefonica.contato.model.Contato
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ContatoNetwork {

    val ContatoAPI by lazy {
        getRetrofit().create(ContatoAPI::class.java)
    }

    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://api-agenda-unifor.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    fun criarContato(usuario: Usuario, contato: Contato, onSuccess:() -> Unit, onError: () -> Unit){
        ContatoAPI.criarContato(usuario.uid!!, usuario.acessToken!!, usuario.client!!, contato)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({

                    it?.let {
                        onSuccess()
                    }
                },{
                    onError()
                })
    }

    fun listarContato(usuario: Usuario, onSuccess: () -> Unit,onError: () -> Unit){
        ContatoAPI.listarContato(usuario.uid!!, usuario.client!!, usuario.acessToken!!)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({

                    it?.let {
                        onSuccess()
                    }
                },{
                    onError()
                })
    }

}