package io.github.utn203241061

import io.github.utn203241061.R

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etUno=findViewById<View>(R.id.etUno) as EditText
        var enDos=findViewById<View>(R.id.etDos) as EditText

        var btnEn=findViewById<View>(R.id.btnEn) as Button
        btnEn.setOnClickListener(View.OnClickListener {
            var resultado=etUno.text.toString().toInt()+enDos.text.toString().toInt()
            Toast.makeText(this, "El resultado es: "+resultado,Toast.LENGTH_LONG).show()
        })
        var btnRes=findViewById<View>(R.id.btnRes) as Button
        btnRes.setOnClickListener(View.OnClickListener {
            var resultado1=etUno.text.toString().toInt()-enDos.text.toString().toInt()
            Toast.makeText(this, "El resultado es: "+resultado1,Toast.LENGTH_LONG).show()
        })
        var btnMul=findViewById<View>(R.id.btnMul) as Button
        btnMul.setOnClickListener(View.OnClickListener {
            var resultado2=etUno.text.toString().toInt()*enDos.text.toString().toInt()
            Toast.makeText(this, "El resultado es: "+resultado2,Toast.LENGTH_LONG).show()
        })
        var btnDiv=findViewById<View>(R.id.btnDiv) as Button
        btnDiv.setOnClickListener(View.OnClickListener {
            var resultado3=etUno.text.toString().toInt()/enDos.text.toString().toInt()
            Toast.makeText(this, "El resultado es: "+resultado3,Toast.LENGTH_LONG).show()
        })
    }
}