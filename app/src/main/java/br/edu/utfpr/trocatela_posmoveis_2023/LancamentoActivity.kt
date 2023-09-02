package br.edu.utfpr.trocatela_posmoveis_2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class LancamentoActivity : AppCompatActivity() {

    private lateinit var etCod : EditText
    private lateinit var etQtd : EditText
    private lateinit var etValor : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lancamento)

        etCod = findViewById( R.id.etCodLancamento )
        etQtd = findViewById( R.id.etQtdLancamento )
        etValor = findViewById( R.id.etValorLancamento )
    }

    fun btListarLancamentoOnClick(view: View) {}
    fun btConfirmarLancamentoOnClick(view: View) {
        val intent = Intent( this, ConfirmarActivity::class.java )
        intent.putExtra( "cod", etCod.text.toString() )
        intent.putExtra( "qtd", etQtd.text.toString() )
        intent.putExtra( "valor", etValor.text.toString() )
        startActivity( intent )
    }
}