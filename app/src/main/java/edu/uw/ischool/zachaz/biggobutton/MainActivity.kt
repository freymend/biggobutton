package edu.uw.ischool.zachaz.biggobutton

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.biggo)
        button.setOnClickListener {
            // Code here executes on main thread after user presses button
            count++
            button.text = resources.getQuantityString(R.plurals.pushed, count, count)
        }
    }
}