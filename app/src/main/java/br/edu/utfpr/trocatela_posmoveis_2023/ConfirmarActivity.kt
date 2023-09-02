package br.edu.utfpr.trocatela_posmoveis_2023

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

    fun btConfirmarConfirmarOnClick(view: View) {
        val sms = "Cod=${etCod.text.toString()} - Qtd=${etQtd.text.toString()} - Valor=${etValor.text.toString()}"

        val intent = Intent( Intent.ACTION_VIEW)
        intent.setData( Uri.parse( "sms:+554699112233" ) )
        intent.putExtra( "sms_body", sms )

        if( intent.resolveActivity( packageManager ) != null ) {
            startActivity(intent)
        }

    }
}