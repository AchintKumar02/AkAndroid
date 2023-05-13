package com.example.dice_roler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var dice1 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val clickBtn : Button = findViewById(R.id.click_btn)
        clickBtn.text = "Roll"
        clickBtn.setOnClickListener{
            rollDice()
        }

        dice1 =  findViewById(R.id.Dice1)

    }
    private fun rollDice() {

        val drawableResource = when(Random().nextInt(6) +1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        dice1.setImageResource(drawableResource)
    }
}