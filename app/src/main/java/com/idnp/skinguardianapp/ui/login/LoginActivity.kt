package com.idnp.skinguardianapp.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.idnp.skinguardianapp.ProfileActivity
import com.idnp.skinguardianapp.R
import com.idnp.skinguardianapp.ui.home.HomeActivity

class LoginActivity : AppCompatActivity() {

    // Declarar los EditText
    private lateinit var usuarioEditText: EditText
    private lateinit var contraseniaEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val ingresarButton: Button = findViewById(R.id.buttonIngresar)
        ingresarButton.setOnClickListener(View.OnClickListener {


            usuarioEditText = findViewById(R.id.etUser)
            contraseniaEditText = findViewById(R.id.etPassw)

            val usuario: String = usuarioEditText.text.toString()
            val contrasenia: String = contraseniaEditText.text.toString()

            if (usuario == "carlos" && contrasenia == "1234") {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(
                    applicationContext,
                    "Usuario o contraseña incorrectos",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}