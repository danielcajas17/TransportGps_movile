package com.example.transportgps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        ////se conecta a la vista de el login

        val irLogin = findViewById<TextView>(R.id.login_transport)
        irLogin.setOnClickListener{
            LoginIr()
        }
    }
    private fun LoginIr (){
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)

        ////se conecta a la vista de olvido su contraseña

        val RegresarInicioDeSesion = findViewById<Button>(R.id.login)
        RegresarInicioDeSesion .setOnClickListener{
            IrInicioDeSesion()
        }
    }
    private fun IrInicioDeSesion (){
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }
}