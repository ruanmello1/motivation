package com.ruanmello.motivation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ruanmello.motivation.R
import com.ruanmello.motivation.infra.MotivationConstants
import com.ruanmello.motivation.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mSecurityPreferences = SecurityPreferences(this)

//        remover a barra Motivation
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        buttonSave.setOnClickListener(this)

        verifyName()
//salvando nome do usuario
        val securityPreferences = SecurityPreferences(this)
        securityPreferences.storeString("", "")
    }






    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonSave)
            handleSave()
    }

    private fun verifyName() {
        val name = mSecurityPreferences.getString((MotivationConstants.KEY.PERSON_NAME))
        if (name != ""){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun handleSave() {
        val name = editName.text.toString()

        if (name != "") {
//       intent inicia uma nova activity, permite a navegação entre elas
            mSecurityPreferences.storeString(MotivationConstants.KEY.PERSON_NAME, name)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
//context são as informações da aplicação, this sempre funciona em uma classe
//            que extendo app.activity,pq activity de android sempre tem contexto
        } else {
            Toast.makeText(this, "Informe seu nome!", Toast.LENGTH_SHORT).show()
        }
    }
}