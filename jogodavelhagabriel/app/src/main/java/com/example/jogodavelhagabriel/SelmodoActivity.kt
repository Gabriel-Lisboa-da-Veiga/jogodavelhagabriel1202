package com.example.jogodavelhagabriel

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.example.jogodavelhagabriel.databinding.SelemodoactivityMainBinding


class SelmodoActivity : AppCompatActivity () {

    private lateinit var binding: SelemodoactivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SelemodoactivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botao1x1.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            //Início da proxima atividade.
            startActivity(intent)

        }

        binding.botaoROBO.setOnClickListener {

            val intent = Intent(this, ModoMaquinaActivity::class.java)
            //Início da proxima atividade.
            startActivity(intent)


        }
    }
}