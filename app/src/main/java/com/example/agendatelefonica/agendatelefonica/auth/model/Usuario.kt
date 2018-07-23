package com.example.agendatelefonica.agendatelefonica.auth.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Usuario: RealmObject(){

    @PrimaryKey var id: Int = 0
    var name: String? = null
    var email: String? = null
    var password: String? = null

    @SerializedName("password_confirmation")
    var passwordConfirmation: String? = null

    var uid: String? = null
    var client: String? = null
    var acessToken: String? = null

}