package com.example.agendatelefonica.agendatelefonica.contato.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Contato : RealmObject() {

    @PrimaryKey
    var id: String? = null
    var name: String? = null
    var email: String? = null
    var phone: String? = null
    var picture: String? = "http://www.topimagens.com.br/imagens/imagens-mais-novas.jpg"
    var birth: Long? = null
}