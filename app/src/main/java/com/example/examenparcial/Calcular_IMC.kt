package com.example.examenparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calcular_imc.*
import kotlinx.android.synthetic.main.activity_imc_flaco.*

class Calcular_IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_imc)
        // IMC = PC/ (HSh * OT)

        btn_calcularIMC.setOnClickListener() {
            var PC = et_peso.text.toString().toDouble()
            var HSh = et_Altura.text.toString().toDouble()
            var OT = et_Occipucio.text.toString().toDouble()

            var IMC = PC / (HSh * OT)
            tv_IMC.setText("El peso es: ${IMC}")
        }
    }
}