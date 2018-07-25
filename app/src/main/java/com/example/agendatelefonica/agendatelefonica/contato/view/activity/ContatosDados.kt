package com.example.agendatelefonica.agendatelefonica.contato.view.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.example.agendatelefonica.agendatelefonica.R
import com.example.agendatelefonica.agendatelefonica.contato.business.ContatoBusiness
import com.example.agendatelefonica.agendatelefonica.contato.model.Contato
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_criar_editar_contato.*
import kotlinx.android.synthetic.main.activity_main.*

class ContatosDados : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_editar_contato)

        Realm.init(this)

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

            val contato = Contato()
            contato.name = edit_nome_contato.text.toString()
            contato.email = edit_email_contato.text.toString()
            contato.phone = edit_telefone_contato.text.toString()
            contato.picture = edit_url_imagem_contato.text.toString()


            ContatoBusiness.criarContato(contato, {
                Snackbar.make(botaoCriarConta, "Contato criado!", Snackbar.LENGTH_SHORT).show()

                val intentContatosActivity = Intent(this, ContatosActivity::class.java)
                startActivity(intentContatosActivity)
            }, {
                Snackbar.make(botaoCriarConta, "Dados invalidos!", Snackbar.LENGTH_SHORT).show()
            })

        }
    }

    private fun configBotaoEditarContato() {
        botaoEditarContato.setOnClickListener {

        }
    }

}