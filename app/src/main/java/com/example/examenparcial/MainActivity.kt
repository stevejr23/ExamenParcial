package com.example.examenparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Redireccionar a la ventada donde se realiza el calculo de IMC
        btn_imc.setOnClickListener {
            val saltar: Intent = Intent(this, Calcular_IMC::class.java)
            startActivity(saltar)
        }

        // Redireccionar a la ventada de grasa corporal del macho
        btn_grasa_macho.setOnClickListener {
            val saltar2: Intent = Intent(this, IMC::class.java)
            startActivity(saltar2)
        }

        // Redireccionar a la ventada de grasa corporal de la hembra
        btn_grasa_hembra.setOnClickListener {
            val saltar3: Intent = Intent(this, Calcular_IMC_Hembra::class.java)
            startActivity(saltar3)
        }


    }
}