package br.edu.utfpr.trocatela_posmoveis_2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btLancamentoInicialOnClick(view: View) {
        val intent = Intent( this, LancamentoActivity::class.java)
        startActivity(  intent )
    }
}