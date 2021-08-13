package org.bedu.proyectobedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.button.MaterialButton

class InicioActivity : AppCompatActivity() {

    private lateinit var boton : MaterialButton
    private lateinit var nombre: EditText
    private lateinit var contrasena : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        boton = findViewById(R. id.button)
        nombre = findViewById(R. id.name)
        contrasena = findViewById(R.id.password)

        boton.setOnClickListener{
            if(
                nombre.text.toString() != "" &&
                contrasena.text.toString() != ""){

                startActivity(Intent(this, PrincipalActivity::class.java))
            }
            else{
                Toast.makeText(applicationContext, "No ha llenado todos los campos" , Toast.LENGTH_LONG).show()
            }
        }
    }

}