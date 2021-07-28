package org.bedu.proyectobedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button as Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var boton1 : Button
    private lateinit var boton2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton1 = findViewById(R.id.button)
        boton2 = findViewById(R.id.button2)

        boton1.setOnClickListener{

            startActivity(Intent(this, InicioActivity::class.java))
        }

        boton2.setOnClickListener{

            startActivity(Intent(this, activity_registro::class.java))
        }


    }
}