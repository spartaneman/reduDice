package com.example.redudice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.redudice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollButton.setOnClickListener {
            rollDice()
        }

        binding.countUpButton.setOnClickListener {
            countUp()
        }

    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        binding.diceOutcomeTextview.text = randomInt.toString()
    }
    private fun countUp(){
        val textInt =binding.diceOutcomeTextview.text.toString().toInt()

        if(textInt == 6)
        {
            binding.diceOutcomeTextview.text = textInt.toString()
        }
        else
        {
            binding.diceOutcomeTextview.text = "${textInt + 1}"
        }

    }
}