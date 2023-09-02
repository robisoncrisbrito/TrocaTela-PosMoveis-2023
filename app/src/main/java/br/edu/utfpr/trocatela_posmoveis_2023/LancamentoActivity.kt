package br.edu.utfpr.trocatela_posmoveis_2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

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

    fun btListarLancamentoOnClick(view: View) {
        val intent = Intent( this, ListarActivity::class.java ).let {
            register.launch( it )
        }
    }

    val register = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult() ){
            result : ActivityResult ->

            if ( result.resultCode == RESULT_OK ) {
                result.data?.let {
                    if ( it.hasExtra( "codRetorno" ) ) {
                        val codRetorno = it.getStringExtra( "codRetorno" )
                        etCod.setText( codRetorno )
                    }
                }
            }
        }




    fun btConfirmarLancamentoOnClick(view: View) {
        val intent = Intent( this, ConfirmarActivity::class.java )
        intent.putExtra( "cod", etCod.text.toString() )
        intent.putExtra( "qtd", etQtd.text.toString() )
        intent.putExtra( "valor", etValor.text.toString() )
        startActivity( intent )
    }
}