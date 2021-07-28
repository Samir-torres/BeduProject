package org.bedu.proyectobedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class activity_registro : AppCompatActivity() {

    private lateinit var nombre : EditText
    private lateinit var telefono : EditText
    private lateinit var correo : EditText
    private lateinit var contraseña : EditText
    private lateinit var confirmaContraseña : EditText
    private lateinit var boton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro2)

        nombre = findViewById(R.id.name)
        telefono = findViewById(R.id.phone)
        correo = findViewById(R.id.email)
        contraseña = findViewById(R.id.password)
        confirmaContraseña = findViewById(R.id.confirmPassword)

        boton = findViewById(R.id.button)

        boton.setOnClickListener{
            if(
                nombre.text.toString() != "" &&
                telefono.text.toString() != "" &&
                correo.text.toString() != "" &&
                contraseña.text.toString() != "" &&
                confirmaContraseña.text.toString() != "") {
                    if (contraseña.text.toString() != confirmaContraseña.text.toString()){
                        Toast.makeText(applicationContext, "Las contraseñas no coinciden" , Toast.LENGTH_LONG).show()
                    }else{
                        Toast.makeText(applicationContext, "Felicidades, ha sido registrado" , Toast.LENGTH_LONG).show()
                        startActivity(Intent(this, InicioActivity::class.java))
                    }

            }else{
                Toast.makeText(applicationContext, "No ha llenado todos los campos" , Toast.LENGTH_LONG).show()
            }
        }
    }
}