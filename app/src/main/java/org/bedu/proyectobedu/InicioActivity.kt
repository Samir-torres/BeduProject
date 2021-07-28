package org.bedu.proyectobedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class InicioActivity : AppCompatActivity() {

    private lateinit var boton : Button
    private lateinit var nombre: EditText
    private lateinit var contraseña : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        boton = findViewById(R. id.button)
        nombre = findViewById(R. id.name)
        contraseña = findViewById(R.id.password)

        boton.setOnClickListener{
            if(
                nombre.text.toString() != "" &&
                contraseña.text.toString() != ""){

                startActivity(Intent(this, TiendaActivity::class.java))
            }
            else{
                Toast.makeText(applicationContext, "No ha llenado todos los campos" , Toast.LENGTH_LONG).show()
            }
        }
    }
}