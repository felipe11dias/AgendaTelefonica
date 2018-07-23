package com.example.agendatelefonica.agendatelefonica.contato.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.agendatelefonica.agendatelefonica.R
import com.example.agendatelefonica.agendatelefonica.contato.model.Contato
import com.example.agendatelefonica.agendatelefonica.contato.network.ContatoNetwork
import kotlinx.android.synthetic.main.activity_criar_editar_contato.*

class ContatosDados : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_editar_contato)

        configBotaoEditarContato()
        configBotaoCriarContato()
        configBotaoApagarContato()


    }

    private fun configBotaoApagarContato() {
        botao_apagar_contato.setOnClickListener {

        }
    }

    private fun configBotaoCriarContato() {

        botaoCriarContato.setOnClickListener {

            var contato = Contato()

            contato.name = edit_nome_contato.text.toString()
            contato.email = edit_email_contato.text.toString()
            contato.telefone = edit_telefone_contato.text.toString()
            contato.avatarUrl = edit_url_imagem_contato.text.toString()

            // ContatoNetwork.criarContato()

        }
    }

    private fun configBotaoEditarContato() {
        botaoEditarContato.setOnClickListener {

        }
    }

}