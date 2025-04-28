package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Hoạt động cho phép người dùng tung xúc xắc và xem kết quả trên màn hình.
 */
class MainActivity : AppCompatActivity() {

    /**
     * Phương thức này được gọi khhi hoạt động được tạo.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button in the layout
        val rollButton: Button = findViewById(R.id.button)

        // Set a click listener on the button
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Đổ xúc xắc và cập nhật kết quả lên màn hình.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

/**
 * Xúc xắc với số mặt cố định.
 */
class Dice(private val numSides: Int) {

    /**
     * Thực hiện tung xúc xắc ngẫu nhien và trả về kết quả.
     */
    fun roll(): Int {
        return (1..numSides).random()
    }
}
