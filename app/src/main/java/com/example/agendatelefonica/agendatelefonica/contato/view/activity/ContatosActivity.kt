package com.example.agendatelefonica.agendatelefonica.contato.view.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.example.agendatelefonica.agendatelefonica.R
import kotlinx.android.synthetic.main.activity_contato.*
import kotlinx.android.synthetic.main.activity_main.*

class ContatosActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)


        configBotaoCriarContato()
    }

    private fun configBotaoCriarContato() {
        botaoCriarNovoContato.setOnClickListener {

            val intentDetalhesActivity = Intent(this, ContatosDados::class.java)
            startActivity(intentDetalhesActivity)

            Snackbar.make(botaoCriarConta, "Deu tudo certo!", Snackbar.LENGTH_SHORT).show()
        }
    }


}