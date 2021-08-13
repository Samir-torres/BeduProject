package org.bedu.proyectobedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class BuyActivity : AppCompatActivity() {

    private lateinit var boton : MaterialButton
    private lateinit var nombre: EditText
    private lateinit var contrasena : EditText
    private lateinit var tarjeta : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        boton = findViewById(R.id.button_compra)
        nombre = findViewById(R.id.name_compra)
        contrasena = findViewById(R.id.password_compra)
        tarjeta = findViewById(R.id.tarjeta)

        boton.setOnClickListener{
            if(
                nombre.text.toString() != "" &&
                contrasena.text.toString() != "" &&
                tarjeta.text.toString() != ""){

                startActivity(Intent(this, PrincipalActivity::class.java))
                Toast.makeText(applicationContext, "Su compra ha sido realizada" , Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(applicationContext, "No ha llenado todos los campos" , Toast.LENGTH_LONG).show()
            }
        }
    }
}