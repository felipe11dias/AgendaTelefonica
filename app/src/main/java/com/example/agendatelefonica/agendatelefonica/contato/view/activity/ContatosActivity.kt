package com.example.agendatelefonica.agendatelefonica.contato.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.RecoverySystem
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.recyclerview.R.attr.layoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.agendatelefonica.agendatelefonica.R
import com.example.agendatelefonica.agendatelefonica.contato.adapter.ContatoAdapter
import kotlinx.android.synthetic.main.activity_contato.*
import kotlinx.android.synthetic.main.activity_main.*

class ContatosActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)

        configRecyclerViewAdapter()
        configBotaoCriarContato()
    }

    private fun configRecyclerViewAdapter() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContatoAdapter()
    }

    private fun configBotaoCriarContato() {
        botaoCriarNovoContato.setOnClickListener {

            val intentContatosDados = Intent(this, ContatosDados::class.java)
            startActivity(intentContatosDados)
        }
    }


}
