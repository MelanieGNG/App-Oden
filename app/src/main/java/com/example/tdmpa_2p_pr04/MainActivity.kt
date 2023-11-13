package com.example.tdmpa_2p_pr04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ingredientes: MutableList<String> = mutableListOf()
        val precioC: MutableList<Int> = mutableListOf()
        val precio: MutableList<String> = mutableListOf()
        val cantidad: MutableList<String> = mutableListOf()

        val txtPlat = findViewById<TextView>(R.id.txtPlatillo)
        val txtPrecio = findViewById<TextView>(R.id.txtPrecio)
        val txtCant = findViewById<TextView>(R.id.txtCantidad)
        val txtCan = findViewById<EditText>(R.id.txtCan)
        val btnOk = findViewById<Button>(R.id.btnCan)
        val btnNext = findViewById<Button>(R.id.btnNext)

        val chipGim = findViewById<Chip>(R.id.chpGimbap)
        val chipBibi = findViewById<Chip>(R.id.chpbibimbap)
        val chipBoss = findViewById<Chip>(R.id.chpBossam)
        val chipJap = findViewById<Chip>(R.id.chpJapchae)
        val chipKimchi = findViewById<Chip>(R.id.chpKimchi)
        val chipKimp = findViewById<Chip>(R.id.chpKimpab)
        val chipMochi = findViewById<Chip>(R.id.chpMochis)
        val chipRamen = findViewById<Chip>(R.id.chpRamen)
        val chipTeok = findViewById<Chip>(R.id.chpTeok)

        val txtExtra = findViewById<EditText>(R.id.txtExtras)


        chipBibi.setOnClickListener{
            val pre = 120
            val prec = "$120"

            if(chipBibi.isChecked) {
                ingredientes.add(chipBibi.text.toString())
                precioC.add(pre)
                precio.add(prec)
            }
            else {

                var indice = ingredientes.indexOf(chipBibi.text.toString())

                if(cantidad.size != ingredientes.size){
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                }
                else {
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                    cantidad.removeAt(indice)
                }
            }

            txtPlat.text = ingredientes.joinToString ( "\n" )
            txtPrecio.text = precio.joinToString ( "\n" )
            txtCant.text = cantidad.joinToString ( "\n" )

        }

        chipGim.setOnClickListener{
            val pre = 80
            val prec = "$80"

            if(chipGim.isChecked) {
                ingredientes.add(chipGim.text.toString())
                precioC.add(pre)
                precio.add(prec)
            }
            else {
                var indice = ingredientes.indexOf(chipGim.text.toString())

                if(cantidad.size != ingredientes.size){
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                }
                else {
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                    cantidad.removeAt(indice)
                }
            }

            txtPlat.text = ingredientes.joinToString ( "\n" )
            txtPrecio.text = precio.joinToString ( "\n" )
            txtCant.text = cantidad.joinToString ( "\n" )

        }

        chipBoss.setOnClickListener{
            val pre = 110
            val prec = "$110"

            if(chipBoss.isChecked) {
                ingredientes.add(chipBoss.text.toString())
                precioC.add(pre)
                precio.add(prec)
            }
            else {
                var indice = ingredientes.indexOf(chipBoss.text.toString())

                if(cantidad.size != ingredientes.size){
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                }
                else {
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                    cantidad.removeAt(indice)
                }
            }

            txtPlat.text = ingredientes.joinToString ( "\n" )
            txtPrecio.text = precio.joinToString ( "\n" )
            txtCant.text = cantidad.joinToString ( "\n" )

        }

        chipJap.setOnClickListener{
            val pre = 90
            val prec = "$90"

            if(chipJap.isChecked) {
                ingredientes.add(chipJap.text.toString())
                precio.add(prec)
                precioC.add(pre)
            }
            else {
                var indice = ingredientes.indexOf(chipJap.text.toString())

                if(cantidad.size != ingredientes.size){
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                }
                else {
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                    cantidad.removeAt(indice)
                }
            }

            txtPlat.text = ingredientes.joinToString ( "\n" )
            txtPrecio.text = precio.joinToString ( "\n" )
            txtCant.text = cantidad.joinToString ( "\n" )

        }

        chipKimchi.setOnClickListener{
            val pre = 65
            val prec = "$65"

            if(chipKimchi.isChecked) {
                ingredientes.add(chipKimchi.text.toString())
                precio.add(prec)
                precioC.add(pre)
            }
            else {
                var indice = ingredientes.indexOf(chipKimchi.text.toString())

                if(cantidad.size != ingredientes.size){
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                }
                else {
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                    cantidad.removeAt(indice)
                }
            }

            txtPlat.text = ingredientes.joinToString ( "\n" )
            txtPrecio.text = precio.joinToString ( "\n" )
            txtCant.text = cantidad.joinToString ( "\n" )

        }

        chipKimp.setOnClickListener{
            val pre = 80
            val prec = "$80"

            if(chipKimp.isChecked) {
                ingredientes.add(chipKimp.text.toString())
                precio.add(prec)
                precioC.add(pre)
            }
            else {
                var indice = ingredientes.indexOf(chipKimp.text.toString())

                if(cantidad.size != ingredientes.size){
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                }
                else {
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                    cantidad.removeAt(indice)
                }
            }
            txtPlat.text = ingredientes.joinToString ( "\n" )
            txtPrecio.text = precio.joinToString ( "\n" )
            txtCant.text = cantidad.joinToString ( "\n" )
        }

        chipMochi.setOnClickListener{
            val pre = 40
            val prec = "$40"

            if(chipMochi.isChecked) {
                ingredientes.add(chipMochi.text.toString())
                precio.add(prec)
                precioC.add(pre)
            }
            else {
                var indice = ingredientes.indexOf(chipMochi.text.toString())

                if(cantidad.size != ingredientes.size){
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                }
                else {
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                    cantidad.removeAt(indice)
                }
            }

            txtPlat.text = ingredientes.joinToString ( "\n" )
            txtPrecio.text = precio.joinToString ( "\n" )
            txtCant.text = cantidad.joinToString ( "\n" )

        }


        chipRamen.setOnClickListener{
            val pre = 70
            val prec = "$70"

            if(chipRamen.isChecked) {
                ingredientes.add(chipRamen.text.toString())
                precio.add(prec)
                precioC.add(pre)
            }
            else {
                var indice = ingredientes.indexOf(chipRamen.text.toString())

                if(cantidad.size != ingredientes.size){
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                }
                else {
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                    cantidad.removeAt(indice)
                }
            }

            txtPlat.text = ingredientes.joinToString ( "\n" )
            txtPrecio.text = precio.joinToString ( "\n" )
            txtCant.text = cantidad.joinToString ( "\n" )

        }

        chipTeok.setOnClickListener{
            val pre = 20
            val prec = "$20"

            if(chipTeok.isChecked) {
                ingredientes.add(chipTeok.text.toString())
                precio.add(prec)
                precioC.add(pre)
            }
            else {
                var indice = ingredientes.indexOf(chipTeok.text.toString())

                if(cantidad.size != ingredientes.size){
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                }
                else {
                    ingredientes.removeAt(indice)
                    precio.removeAt(indice)
                    cantidad.removeAt(indice)
                }
            }

            txtPlat.text = ingredientes.joinToString ( "\n" )
            txtPrecio.text = precio.joinToString ( "\n" )
            txtCant.text = cantidad.joinToString ( "\n" )

        }

        btnOk.setOnClickListener{
            cantidad.add(txtCan.text.toString())
             txtCant.text = cantidad.joinToString ( "\n" )
             txtCan.text = null
        }


        btnNext.setOnClickListener{
            var suma = 0

            for (i in precioC.indices) {
                val costo = precioC[i]
                val canti = cantidad[i].toInt()
                val res = costo * canti
                suma += res
            }

            val intento = Intent(this@MainActivity, OrdenActivity::class.java)
            intento.putExtra("suma", suma)
            intento.putStringArrayListExtra("lista", ArrayList(ingredientes))
            intento.putStringArrayListExtra("listap", ArrayList(precio))
            intento.putStringArrayListExtra("listac", ArrayList(cantidad))

            startActivity(intento)
        }

        txtExtra.setOnKeyListener{_,keyCode,event->
            if(event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER){
                agregarChip(txtExtra.text.toString())
            }
            false
        }
    }

    private fun agregarChip(ingrediente:String){
        val chip = Chip(this@MainActivity)
        chip.text = ingrediente
        chip.isClickable = true
        chip.isClickable = false

        val chgExtras =  findViewById<ChipGroup>(R.id.chgExtras)
        chgExtras.addView(chip as View)
        chip.setOnClickListener{
            chgExtras.removeView(chip as View)
        }
    }
}