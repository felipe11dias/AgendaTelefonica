package com.example.agendatelefonica.agendatelefonica.contato.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Contato : RealmObject(){

    @PrimaryKey
    var id: String? = null
    var name: String? = null
    var email: String? = null
    var telefone: String? =null
    @SerializedName("avatar_url")
    var avatarUrl: String? = null

}