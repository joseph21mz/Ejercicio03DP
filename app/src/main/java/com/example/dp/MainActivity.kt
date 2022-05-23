package com.example.dp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.IntegerRes
import android.widget.TextView as TextView1


class MainActivity : AppCompatActivity() {

    lateinit var valorUno : EditText
    lateinit var valorDos : EditText
    lateinit var Resultado :android.widget.TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valorUno = this.findViewById(R.id.valorUNO)
        valorDos = this.findViewById(R.id.valorDOS)
        Resultado = this.findViewById(R.id.Resultado)

        }

         fun sumar(view :View) {
             var numero1:String = valorUno.text.toString()
             var numero2:String = valorDos.text.toString()
             val operacion = (numero1.toFloat() + numero2.toFloat() )
             Resultado.setText(operacion.toString())
         }

        fun restar(view :View) {
            var numero1:String = valorUno.text.toString()
            var numero2:String = valorDos.text.toString()
            val operacion = (numero1.toFloat() - numero2.toFloat() )
            Resultado.setText(operacion.toString())
        }

        fun multiplicar(view :View) {
            var numero1:String = valorUno.text.toString()
            var numero2:String = valorDos.text.toString()
            val operacion = (numero1.toFloat() * numero2.toFloat() )
            Resultado.setText(operacion.toString())
            }

        fun dividir(view :View) {
            var numero1:String = valorUno.text.toString()
            var numero2:String = valorDos.text.toString()
            val operacion = (numero1.toFloat() / numero2.toFloat() )
            Resultado.setText(operacion.toString())
        }
    }


