package com.example.tdmpa_2p_pr04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OrdenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orden)

        val txtPlat = findViewById<TextView>(R.id.txtPlatillos)
        val txtPrec = findViewById<TextView>(R.id.txtPrecios)
        val txtCant = findViewById<TextView>(R.id.txtCantidades)

        val platillos = intent.getStringArrayListExtra("lista")

        if (platillos != null) {
            for (platillo in platillos) {
                txtPlat.text = platillos.joinToString ( "\n" )
            }
        }

        val precios = intent.getStringArrayListExtra("listap")

        if (precios != null) {
            for (precio in precios) {
                txtPrec.text = precios.joinToString ( "\n" )
            }
        }

        val cantidades = intent.getStringArrayListExtra("listac")

        if (cantidades != null) {
            for (cantidad in cantidades) {
                txtCant.text = cantidades.joinToString ( "\n" )
            }
        }

        val suma = intent.extras?.getInt("suma")

        val txtTotal = findViewById<TextView>(R.id.txtTotal)
        txtTotal.text = suma.toString()
    }
}