package com.aakriti.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnRoll :Button
    lateinit var imgDisplay:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRoll=findViewById(R.id.btnRoll)
        imgDisplay=findViewById(R.id.imgDisplay)
        btnRoll.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice() {
        when ((1..6).random()) {
            1 -> {imgDisplay.setImageResource(R.drawable.dice_1)
                Toast.makeText(this, "Vuhu !!! You got 1", Toast.LENGTH_SHORT).show()}
            2 ->{ imgDisplay.setImageResource(R.drawable.dice_2)
            Toast.makeText(this, "Vuhu !!! You got 2", Toast.LENGTH_SHORT).show()}
            3 ->{ imgDisplay.setImageResource(R.drawable.dice_3)
            Toast.makeText(this, "Vuhu !!! You got 3", Toast.LENGTH_SHORT).show()}
            4 ->{ imgDisplay.setImageResource(R.drawable.dice_4)
            Toast.makeText(this, "Vuhu !!! You got 4", Toast.LENGTH_SHORT).show()}
            5 -> {imgDisplay.setImageResource(R.drawable.dice_5)
             Toast.makeText(this, "Vuhu !!! You got 5", Toast.LENGTH_SHORT).show()}
            6 ->{ imgDisplay.setImageResource(R.drawable.dice_6)
            Toast.makeText(this, "Vuhu !!! You got 6", Toast.LENGTH_SHORT).show()}
        }
    }
}
