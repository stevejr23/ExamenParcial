package com.example.examenparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calcular_imc.*
import kotlinx.android.synthetic.main.activity_imc.*

import kotlinx.android.synthetic.main.activity_main.*

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val extras = intent.extras
        val peso = extras?.getInt("peso") ?: -1
        val altura = extras?.getInt("altura") ?: -1
        val occipucio = extras?.getInt("occipucio") ?: -1
        val genero = extras?.getString("genero") ?: "sin genero"
        val nombres = extras?.getString("nombre") ?: "sin nombre"
        val raza = extras?.getString("raza") ?: "raza sin identificar"


        // IMC = PC/ (HSh * OT)

        btn_calcularIMC.setOnClickListener() {
            var PC = et_peso.text.toString().toDouble()
            var HSh = et_Altura.text.toString().toDouble()
            var OT = et_Occipucio.text.toString().toDouble()

            var IMC = PC / (HSh * OT)
            tv_IMC_nombre.setText(
                "El IMC de" + nombres + " es : $IMC"
            )

            if (IMC < 6) {
                var mensajePeso = "Sobre Pes"
                tv_Peso.setText(mensajePeso)
            } else if (IMC > 6) {
                var mensajePeso = "Peso Bajo"
                tv_Peso.setText(mensajePeso)
            } else {
                var mensajePeso = "Peso Normal"
                tv_Peso.setText(mensajePeso)
            }
        }

        btn_regresar.setOnClickListener() {
            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }
}