package com.training.meuprimeiroprojetodocurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var contador = 1 // contador de cliques do botão
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear( view: View){
        println("Iae")
        val textoPai = findViewById<TextView>(R.id.text_pai) // encontrar um item do activity_main
        //val numero = Random.nextInt(10) //Usar um numero aleatorio de 0 a 9
        val numero = contador++ //incrementar contador
        textoPai.setText("Você clicou $numero vezes!")
    }


}