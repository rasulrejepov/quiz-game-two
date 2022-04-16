package com.example.myapplication00002002001

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.myapplication00002002001.databinding.ActivityMainBinding
import com.example.myapplication00002002001.databinding.QuizTestMainBinding
import kotlin.math.roundToInt

class QuizTestMain: AppCompatActivity() {

    var answer = 0

    var countQuestionList_country = 0
    var trueAnswer = 0
    private lateinit var binding: QuizTestMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = QuizTestMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var c: Boolean = intent.getBooleanExtra("image_view_visibility", true)
        binding.questionImage.isVisible = c
        var a = intent.getIntExtra("quiz_number", 0)
        WhenIntent(a)
        binding.questionText.isVisible = intent.getBooleanExtra("text_view_visibility", true)
        binding.answerButtonOne.setOnClickListener{
            allBUttonColorBlue()
            binding.buttonNextOrContinue.setText(R.string.submit)
            answer = 1
            it.setBackgroundColor(Color.YELLOW)

        }
        binding.answerButtonTwo.setOnClickListener{
            allBUttonColorBlue()
            binding.buttonNextOrContinue.setText(R.string.submit)
            answer = 2
            it.setBackgroundColor(Color.YELLOW)
        }
        binding.answerButtonThree.setOnClickListener{
            allBUttonColorBlue()
            binding.buttonNextOrContinue.setText(R.string.submit)
            answer = 3
            it.setBackgroundColor(Color.YELLOW)
        }
        binding.answerButtonFour.setOnClickListener{
            allBUttonColorBlue()
            binding.buttonNextOrContinue.setText(R.string.submit)
            answer = 4
            it.setBackgroundColor(Color.YELLOW)
        }

        binding.buttonNextOrContinue.setOnClickListener{
            if(binding.buttonNextOrContinue.text=="Continue"){
                WhenIntent(a)

                binding.answerButtonThree.isEnabled = true
                binding.answerButtonFour.isEnabled = true
                binding.answerButtonOne.isEnabled = true
                binding.answerButtonTwo.isEnabled = true
                allBUttonColorBlue()
            }
            else if(binding.buttonNextOrContinue.text=="Submit"){
                when(answer){
                    1->{
                        binding.answerButtonOne.setBackgroundColor(Color.RED)
                    }
                    2->{
                        binding.answerButtonTwo.setBackgroundColor(Color.RED)
                    }
                    3->{
                        binding.answerButtonThree.setBackgroundColor(Color.RED)
                    }
                    4->{
                        binding.answerButtonFour.setBackgroundColor(Color.RED)
                    }
                }
                when(trueAnswer){
                    1->{
                        binding.answerButtonOne.setBackgroundColor(Color.GREEN)
                    }
                    2->{
                        binding.answerButtonTwo.setBackgroundColor(Color.GREEN)
                    }
                    3->{
                        binding.answerButtonThree.setBackgroundColor(Color.GREEN)
                    }
                    4->{
                        binding.answerButtonFour.setBackgroundColor(Color.GREEN)
                    }
                }
                binding.answerButtonThree.isEnabled = false
                binding.answerButtonFour.isEnabled = false
                binding.answerButtonOne.isEnabled = false
                binding.answerButtonTwo.isEnabled = false
                binding.buttonNextOrContinue.setText(R.string.Continue_games)
            }
        }
    }

    fun allBUttonColorBlue(){
        binding.answerButtonFour.setBackgroundColor(Color.BLUE)
        binding.answerButtonOne.setBackgroundColor(Color.BLUE)
        binding.answerButtonTwo.setBackgroundColor(Color.BLUE)
        binding.answerButtonThree.setBackgroundColor(Color.BLUE)
    }

    private fun WhenIntent(forWhen:Int){
        var r: String = ""
        var w= 0
        when (forWhen) {
            1 -> {
                var a: Int = (Math.random() * 100).toInt()
                var b: Int = (Math.random() * 100).toInt()
                var d: Int = (Math.random() * 4+1).toInt()
                binding.answerButtonOne.text = "${(Math.random()*100).toInt()}"
                binding.answerButtonTwo.text = "${(Math.random()*100).toInt()}"
                binding.answerButtonThree.text = "${(Math.random()*100).toInt()}"
                binding.answerButtonFour.text = "${(Math.random()*100).toInt()}"
                when (d) {
                    1 -> {
                        r = "$a + $b = ?"
                        w = a + b
                        binding.answerButtonOne.text = "$w"
                        trueAnswer = 1
                    }
                    2 -> {
                        r = "$a - $b = ?"
                        w = a - b
                        binding.answerButtonTwo.text = "$w"
                        trueAnswer = 2
                    }
                    3 -> {
                        r = "$a x $b = ?"
                        w = a * b
                        binding.answerButtonThree.text = "$w"
                        trueAnswer = 3
                    }
                    4 -> {
                        r = "$a / $b = ?"
                        w = a / b
                        binding.answerButtonFour.text = "$w"
                        trueAnswer = 4
                    }
                }
                binding.questionText.text = r

            }
            2 -> {

            }
            3 -> {
                if(countQuestionList_country<30) {
                    binding.questionText.text =
                        SaveListClassQuestionCountry.showList()[countQuestionList_country].question_country
                    binding.answerButtonOne.text =
                        SaveListClassQuestionCountry.showList()[countQuestionList_country].center_answer_country_one
                    binding.answerButtonTwo.text =
                        SaveListClassQuestionCountry.showList()[countQuestionList_country].center_answer_country_two
                    binding.answerButtonThree.text =
                        SaveListClassQuestionCountry.showList()[countQuestionList_country].center_answer_country_three
                    binding.answerButtonFour.text =
                        SaveListClassQuestionCountry.showList()[countQuestionList_country].center_answer_country_four
                    trueAnswer = SaveListClassQuestionCountry.showList()[countQuestionList_country].true_answer_country
                }else{
                    countQuestionList_country = 0
                }

            }


        }
    }
}






