package com.example.myapplication00002002001

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication00002002001.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var a = intent.getIntExtra("quiz_number", 0)
        var b = intent.getBooleanExtra("text_view_visibility", true)
        var c: Boolean = intent.getBooleanExtra("image_view_visibility", true)

        var w = intent.getIntExtra("true_answer_result", 0)
        binding.scoreTextView.text = "True answers:     $w/10"

        if (w >= 9) {
            binding.yourResult.setText(R.string.you_win)
            binding.scoreImageView.setImageResource(R.drawable.fire_icon)
        } else if (w <= 8 && w >= 6) {
            binding.yourResult.setText(R.string.You_result_is_good)
            binding.scoreImageView.setImageResource(R.drawable.good_icons)
        } else if (w <= 5 && w >= 3) {
            binding.yourResult.setText(R.string.you_result_is_satisfactory)
            binding.scoreImageView.setImageResource(R.drawable.bad_icons)
        } else if (w <= 2) {
            binding.yourResult.setText(R.string.You_lose)
            binding.scoreImageView.setImageResource(R.drawable.you_lose_icons)
        }
        binding.menuCardView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.menuButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.TryAgainCardView.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            binding.TryAgainCardView.isEnabled = false
            binding.TryAgainButton.isEnabled = false
            intent.putExtra("quiz_number", a)
            intent.putExtra("text_view_visibility", b)
            intent.putExtra("image_view_visibility", c)
            startActivity(intent)
            finish()
        }

        binding.TryAgainButton.setOnClickListener {
            val intent = Intent(this, QuizTestMain::class.java)
            binding.menuCardView.isEnabled = false
            binding.menuButton.isEnabled = false
            intent.putExtra("quiz_number", a)
            intent.putExtra("text_view_visibility", b)
            intent.putExtra("image_view_visibility", c)
            startActivity(intent)
            finish()
        }

    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        super.onBackPressed()
    }


}