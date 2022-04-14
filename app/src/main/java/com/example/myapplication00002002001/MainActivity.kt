package com.example.myapplication00002002001

import android.content.Intent
import android.R.xml
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var binding: MainActivity
    private lateinit var cardView:CardView
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.myButtnIdNextActivity1)
        cardView = findViewById(R.id.myCardViewNextActivity1)
        imageView = findViewById(R.id.MyImageViewNextActivity1)
     //   binding = InputBinding(savedInstanceState)
        cardView.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {

            val intent = Intent(this, QuizTestMain ::class.java)
            startActivity(intent)
        }
        imageView.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            startActivity(intent)
        }
        button = findViewById(R.id.myButtnIdNextActivity2)
        cardView = findViewById(R.id.myCardViewNextActivity2)
        imageView = findViewById(R.id.MyImageViewNextActivity2)
        //   binding = InputBinding(savedInstanceState)
        cardView.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {

            val intent = Intent(this, QuizTestMain ::class.java)
            startActivity(intent)
        }
        imageView.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            startActivity(intent)
        }
        button = findViewById(R.id.myButtnIdNextActivity3)
        cardView = findViewById(R.id.myCardViewNextActivity3)
        imageView = findViewById(R.id.MyImageViewNextActivity3)
        //   binding = InputBinding(savedInstanceState)
        cardView.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {

            val intent = Intent(this, QuizTestMain ::class.java)
            startActivity(intent)
        }
        imageView.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            startActivity(intent)
        }

    }

}