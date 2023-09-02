package br.edu.utfpr.trocatela_posmoveis_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class ConfirmarActivity : AppCompatActivity() {

    private lateinit var etCod : TextView
    private lateinit var etQtd : TextView
    private lateinit var etValor : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar)

        etCod = findViewById( R.id.etCodConfirmar )
        etQtd = findViewById( R.id.etQtdConfirmar )
        etValor = findViewById( R.id.etValorConfirmar )

        val cod = intent.getStringExtra( "cod" )
        val qtd = intent.getStringExtra( "qtd" )
        val valor = intent.getStringExtra( "valor" )

        etCod.setText( cod )
        etQtd.setText( qtd )
        etValor.setText( valor )
    }

    fun btConfirmarConfirmarOnClick(view: View) {}
}