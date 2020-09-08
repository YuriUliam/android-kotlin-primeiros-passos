package com.example.kotlinprimeirospassos

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun handleSubmit(component: View) {
        val name = editTextName.text.toString()
        val age = editTextAge.text.toString().toIntOrNull()

        if (name.length < 1) {
            textViewResult.visibility = View.VISIBLE
            textViewResult.setText("Campo de nome precisa ser preenchido")
            textViewResult.setTextColor(Color.RED)
//            Toast.makeText(this, "Campo de nome precisa ser preenchido", Toast.LENGTH_SHORT);
            return
        }

        if (age == null) {
            textViewResult.visibility = View.VISIBLE
            textViewResult.setText("Digite uma idade válida!")
            textViewResult.setTextColor(Color.RED)
//            Toast.makeText(this, "Digite uma idade válida!", Toast.LENGTH_SHORT)
            return
        }

        if (age < 16) {
            textViewResult.visibility = View.VISIBLE
            textViewResult.setText("$name, você ainda não pode votar :c")
            textViewResult.setTextColor(Color.RED)
            return
        }

        textViewResult.visibility = View.VISIBLE
        textViewResult.setText("$name, você já pode votar! :D")
        textViewResult.setTextColor(Color.GREEN)
//        Toast.makeText(this, response, Toast.LENGTH_LONG);
    }
}