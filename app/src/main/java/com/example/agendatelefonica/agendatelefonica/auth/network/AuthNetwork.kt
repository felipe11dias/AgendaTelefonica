package com.example.agendatelefonica.agendatelefonica.auth.network

import com.example.agendatelefonica.agendatelefonica.auth.model.AuthUsuario
import com.example.agendatelefonica.agendatelefonica.auth.model.Usuario
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object AuthNetwork {

    val AuthAPI by lazy {
        getRetrofit().create(authAPI::class.java)
    }

    //criando retrofit para comunicao com API
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://api-agenda-unifor.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    fun login(usuario: Usuario, onSuccess: (usuario: AuthUsuario) -> Unit, onError:()  -> Unit) {

        AuthAPI.login(usuario)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({

                    it?.let {
                        onSuccess(it)
                    }

                },{
                    onError()
                })
    }


    fun criarUsuario(usuario: Usuario, onSuccess: (usuario: AuthUsuario) -> Unit,onError: () -> Unit){

        AuthAPI.criarUsuario(usuario)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({

                    it?.let {
                        onSuccess(it)
                    }

                },{
                    onError()

                })

    }

}