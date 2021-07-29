package org.bedu.proyectobedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button as Button
import android.content.Intent
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var boton1 : Button
    private lateinit var boton2 : Button
    private lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton1 = findViewById(R.id.button)
        boton2 = findViewById(R.id.button2)
        textView = findViewById(R.id.forgotpass)

        boton1.setOnClickListener{

            startActivity(Intent(this, InicioActivity::class.java))
        }

        boton2.setOnClickListener{

            startActivity(Intent(this, activity_registro::class.java))
        }

        textView.setOnClickListener {

            startActivity(Intent(this, ActivityForgotPass::class.java))
        }
    }
}