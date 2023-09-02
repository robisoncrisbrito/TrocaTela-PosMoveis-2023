package br.edu.utfpr.trocatela_posmoveis_2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class ListarActivity : AppCompatActivity() {

    private lateinit var lvProdutos : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

        lvProdutos = findViewById( R.id.lvProdutos )

        lvProdutos.setOnItemClickListener { adapterView, view, pos, l ->
            Toast.makeText( this, "Posicao: ${pos}", Toast.LENGTH_SHORT ).show()

            val cod = pos.inc().toString()

            Intent().apply {
                putExtra( "codRetorno", cod )
                setResult( RESULT_OK, this )
            }

            finish()

        }



    }

}