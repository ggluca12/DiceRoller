package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val rollButtonCountUp: Button = findViewById(R.id.roll_button_CountUp)
        rollButtonCountUp.setOnClickListener { rollDiceCountUp() }
    }

    private fun rollDice() {
        /*Toast.makeText(this, "button clicked",
                Toast.LENGTH_SHORT).show()*/
        val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!"

        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun rollDiceCountUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text==R.string.roll_label.toString()){
            resultText.text="1"
        }else if(resultText.text == "6"){
            println("Do Nothing")
        }else{
            var value =Integer.valueOf(resultText.text.toString())
            value +=1
            resultText.text=value.toString()
        }

    }

}