package com.example.a2511

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.bt1).setOnClickListener {
        findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.logo2)
        }

        findViewById<Button>(R.id.bt_2).setOnClickListener {
            findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.logo1)}

        findViewById<Button>(R.id.bt_3).setOnClickListener {
            findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.logo1)}
    }
}
