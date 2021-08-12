package org.bedu.proyectobedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class ActivityForgotPass : AppCompatActivity() {
    private lateinit var button: MaterialButton
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)

        button = findViewById(R.id.button_mail_forgot)
        editText = findViewById(R.id.insert_email_forgotten)

        button.setOnClickListener {
            if (editText.text.isEmpty()) {
                Toast.makeText(applicationContext, "Ingresa tu correo electronico", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Se ha enviado correctamente", Toast.LENGTH_LONG).show()
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}
