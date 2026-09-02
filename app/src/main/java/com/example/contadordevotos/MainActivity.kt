package com.example.contadordevotos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val conteoVotos = HashMap<String, Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnVotarJuan = findViewById<Button>(R.id.btnVotarJuan)
        val btnVotarAna = findViewById<Button>(R.id.btnVotarAna)
        val tvVotosJuan = findViewById<TextView>(R.id.tvVotosJuan)
        val tvVotosAna = findViewById<TextView>(R.id.tvVotosAna)
        val tvTotalVotos = findViewById<TextView>(R.id.tvTotalVotos)

        fun actualizar() {
            val votosJuan = conteoVotos.getOrDefault("Juan", 0)
            val votosAna = conteoVotos.getOrDefault("Ana", 0)
            val total = votosJuan + votosAna
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}