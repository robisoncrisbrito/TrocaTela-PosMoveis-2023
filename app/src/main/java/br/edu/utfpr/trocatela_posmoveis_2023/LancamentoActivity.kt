package br.edu.utfpr.trocatela_posmoveis_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LancamentoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lancamento)
    }

    fun btListarLancamentoOnClick(view: View) {}
    fun btConfirmarLancamentoOnClick(view: View) {}
}