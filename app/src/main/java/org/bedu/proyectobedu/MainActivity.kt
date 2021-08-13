package org.bedu.proyectobedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button as Button
import android.content.Intent
import android.view.Menu
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout


class MainActivity : AppCompatActivity() {

    private lateinit var boton1 : Button
    private lateinit var boton2 : Button
    private lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appBar = findViewById<Toolbar>(R.id.app_bar)
        this.setSupportActionBar(appBar)
        setupDrawer(appBar)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun setupDrawer(toolbar: Toolbar) {
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val drawerToggle = ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.open_drawer,
                R.string.close_drawer
        )
    }
}