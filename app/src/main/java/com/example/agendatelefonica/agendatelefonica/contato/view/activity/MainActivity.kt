package com.example.agendatelefonica.agendatelefonica.contato.view.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.example.agendatelefonica.agendatelefonica.R
import com.example.agendatelefonica.agendatelefonica.auth.business.AuthBusiness
import com.example.agendatelefonica.agendatelefonica.auth.model.Usuario
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Realm.init(this)

        configBotaoLogin()
        configBotaoCriarConta()
    }

    private fun configBotaoCriarConta() {
        botaoCriarConta.setOnClickListener {

            val usuario = Usuario()
            usuario.email = email_EditText.text.toString()
            usuario.password = password_EditText2.text.toString()
            usuario.passwordConfirmation = password_EditText2.text.toString()

            AuthBusiness.criarUsuario(usuario, {
                Snackbar.make(botaoCriarConta, "Usuario criado com sucesso!", Snackbar.LENGTH_SHORT).show()

            }, { messageResource ->
                Snackbar.make(botaoCriarConta, messageResource, Snackbar.LENGTH_SHORT).show()
            })

        }

    }

    private fun configBotaoLogin() {
        botaoLogin.setOnClickListener {

            val usuario =  Usuario()
            usuario.email = email_EditText.text.toString()
            usuario.password = password_EditText2.text.toString()

            AuthBusiness.login(usuario, {
                Snackbar.make(botaoLogin, "Login efetuado com sucesso!", Snackbar.LENGTH_SHORT).show()

                val intentContatosActivity = Intent(this, ContatosActivity::class.java)
                startActivity(intentContatosActivity)

            }, { messageResource ->
                Snackbar.make(botaoLogin, messageResource, Snackbar.LENGTH_SHORT).show()
            })

        }
    }
}
