package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()

        with(binding) {
            button.setOnClickListener {
                val randomInt = (1..6).random()
                txExample.text = randomInt.toString()
            }
            button2.setOnClickListener {
                val newValue = txExample.text.toString().toInt()
                if (newValue >= 1 && newValue < 6) {
                    txNewValue.text = (newValue + 1).toString()
                } else {
                    Toast.makeText(this@MainActivity, "Valor no adminitido", Toast.LENGTH_SHORT)
                        .show()
                }
            }
            btReset.setOnClickListener {
                val randomQuote = (0..2).random()
                val quote = ProviderQuote.quotesList[randomQuote].key
                if (randomQuote == quote) {
                    txNewValue.text = ProviderQuote.quotesList[randomQuote].quote
                }
            }
            btDice.setOnClickListener {
                getRandomDice()
            }
        }
    }

    private fun getRandomDice() {
        val randomDice = (1..6).random()
        val randomDice2 = (1..6).random()
        with(binding) {
            when (randomDice) {
                1 -> ivDice.setImageResource(R.drawable.dice_1)
                2 -> ivDice.setImageResource(R.drawable.dice_2)
                3 -> ivDice.setImageResource(R.drawable.dice_3)
                4 -> ivDice.setImageResource(R.drawable.dice_4)
                5 -> ivDice.setImageResource(R.drawable.dice_5)
                6 -> ivDice.setImageResource(R.drawable.dice_6)
                else -> ivDice.setImageResource(R.drawable.empty_dice)
            }
            when (randomDice2) {
                1 -> ivDice2.setImageResource(R.drawable.dice_1)
                2 -> ivDice2.setImageResource(R.drawable.dice_2)
                3 -> ivDice2.setImageResource(R.drawable.dice_3)
                4 -> ivDice2.setImageResource(R.drawable.dice_4)
                5 -> ivDice2.setImageResource(R.drawable.dice_5)
                6 -> ivDice2.setImageResource(R.drawable.dice_6)
                else -> ivDice2.setImageResource(R.drawable.empty_dice)
            }
        }
    }
}