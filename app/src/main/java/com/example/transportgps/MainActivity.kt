package com.example.transportgps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        ////se conecta a la vista de olvido su contraseña

        val olvidoContrasena = findViewById<TextView>(R.id.OlvidoSuContraseña)
        olvidoContrasena.setOnClickListener{
            recuperarContrasena()
        }
    }
    private fun recuperarContrasena (){
        val i = Intent(this,recuperarc::class.java)
        startActivity(i)



        ////se conecta a la vista de registro

        val registrarse = findViewById<TextView>(R.id.RegistraUsuario)
        registrarse.setOnClickListener{
            registro()

        }
    }
    private fun registro (){
        val i = Intent(this,registro::class.java)
        startActivity(i)




        /// ir al menu

        val iniciarSesion = findViewById<Button>(R.id.iniciarSesion)
        iniciarSesion.setOnClickListener{
            iniciar()

        }
    }
    private fun iniciar (){
        val i = Intent(this,CardAdapter::class.java)
        startActivity(i)

        val recyclerView = findViewById<RecyclerView>(R.id.card_view)
        val adapter = CardAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


        ////ir a




       



        }
    }



