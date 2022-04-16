package com.example.myapplication00002002001

import android.content.Intent
import android.R.xml
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.myapplication00002002001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.myCardViewNextActivity1.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            intent.putExtra("image_view_visibility",false)
            intent.putExtra("text_view_visibility",true)
            intent.putExtra("quiz_number",1)
            startActivity(intent)
        }
        binding.myButtnIdNextActivity1.setOnClickListener {

            val intent = Intent(this, QuizTestMain ::class.java)
            intent.putExtra("image_view_visibility",false)
            intent.putExtra("text_view_visibility",true)
            intent.putExtra("quiz_number",1)
            startActivity(intent)
        }
        binding.MyImageViewNextActivity1.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            intent.putExtra("image_view_visibility",false)
            intent.putExtra("text_view_visibility",true)
            intent.putExtra("quiz_number",1)
            startActivity(intent)
        }
        binding.myCardViewNextActivity2.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
                intent.putExtra("image_view_visibility",true)
                intent.putExtra("text_view_visibility",false)
                intent.putExtra("quiz_number",2)
            startActivity(intent)
        }
        binding.myButtnIdNextActivity2.setOnClickListener {

            val intent = Intent(this, QuizTestMain ::class.java)
            intent.putExtra("image_view_visibility",true)
            intent.putExtra("text_view_visibility",false)
            intent.putExtra("quiz_number",2)
            startActivity(intent)
        }
        binding.MyImageViewNextActivity2.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            intent.putExtra("image_view_visibility",true)
            intent.putExtra("text_view_visibility",false)
            intent.putExtra("quiz_number",2)
            startActivity(intent)
        }
        binding.myCardViewNextActivity3.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
                intent.putExtra("image_view_visibility",false)
                intent.putExtra("text_view_visibility",true)
                intent.putExtra("quiz_number",3)
            startActivity(intent)
        }
        binding.myButtnIdNextActivity3.setOnClickListener {

            val intent = Intent(this, QuizTestMain ::class.java)
            intent.putExtra("image_view_visibility",false)
            intent.putExtra("text_view_visibility",true)
            intent.putExtra("quiz_number",3)
            startActivity(intent)
        }
        binding.MyImageViewNextActivity3.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            intent.putExtra("image_view_visibility",false)
            intent.putExtra("text_view_visibility",true)
            intent.putExtra("quiz_number",3)
            startActivity(intent)
        }
        binding.woow.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


    }

}