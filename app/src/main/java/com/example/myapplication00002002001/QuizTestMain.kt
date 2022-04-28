package com.example.myapplication00002002001

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.method.Touch
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.myapplication00002002001.databinding.ActivityMainBinding
import com.example.myapplication00002002001.databinding.QuizTestMainBinding
import kotlin.math.roundToInt
import com.example.myapplication00002002001.MainActivity2 as MainActivity21

class QuizTestMain : AppCompatActivity() {

    private lateinit var saveListQuestionCountry: ArrayList<DataClassCountry>
    private var answer: Int = 0
    private var count_true_answer: Int = 0
    private var countQuestionList_country: Int = 0
    private var count_question: Int = 0
    private var trueAnswer: Int = 0
    private var false_Answer_count: Int = 0
    private var boolean_count_answer = true
    private lateinit var binding: QuizTestMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = QuizTestMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var c: Boolean = intent.getBooleanExtra("image_view_visibility", true)
        binding.questionImage.isVisible = c
        var a = intent.getIntExtra("quiz_number", 0)
        var b = intent.getBooleanExtra("text_view_visibility", true)
        binding.questionText.isVisible = b
        binding.trueAnswerText.text = "True answer:     $count_true_answer/10"
        binding.falseAnswerText.text = "False answer:       $false_Answer_count/10"
        WhenIntent(a)
        binding.numberCountText.text = "question number:        $count_question"
        binding.answerButtonOne.setOnClickListener {
            allBUttonColorBlue()
            binding.buttonNextOrContinue.setText(R.string.submit)
            answer = 1
            it.setBackgroundColor(Color.YELLOW)

        }
        binding.answerButtonTwo.setOnClickListener {
            allBUttonColorBlue()
            binding.buttonNextOrContinue.setText(R.string.submit)
            answer = 2
            it.setBackgroundColor(Color.YELLOW)
        }
        binding.answerButtonThree.setOnClickListener {
            allBUttonColorBlue()
            binding.buttonNextOrContinue.setText(R.string.submit)
            answer = 3
            it.setBackgroundColor(Color.YELLOW)
        }
        binding.answerButtonFour.setOnClickListener {
            allBUttonColorBlue()
            binding.buttonNextOrContinue.setText(R.string.submit)
            answer = 4
            it.setBackgroundColor(Color.YELLOW)
        }

        binding.buttonNextOrContinue.setOnClickListener {
            if (binding.buttonNextOrContinue.text == "Continue") {
                WhenIntent(a)
                if (count_question >= 10) {
                    binding.buttonNextOrContinue.setText(R.string.Finish)
                }
                if (boolean_count_answer) {
                    false_Answer_count++
                    binding.falseAnswerText.text = "False answer:       ${false_Answer_count}/10"
                } else {
                    boolean_count_answer = true
                }

                binding.answerButtonThree.isEnabled = true
                binding.answerButtonFour.isEnabled = true
                binding.answerButtonOne.isEnabled = true
                binding.answerButtonTwo.isEnabled = true
                binding.numberCountText.text = "question number:       $count_question"
                allBUttonColorBlue()
            } else if (binding.buttonNextOrContinue.text == "Submit") {

                when (answer) {
                    1 -> {
                        binding.answerButtonOne.setBackgroundColor(Color.RED)
                    }
                    2 -> {
                        binding.answerButtonTwo.setBackgroundColor(Color.RED)
                    }
                    3 -> {
                        binding.answerButtonThree.setBackgroundColor(Color.RED)
                    }
                    4 -> {
                        binding.answerButtonFour.setBackgroundColor(Color.RED)
                    }
                }
                when (trueAnswer) {
                    1 -> {
                        binding.answerButtonOne.setBackgroundColor(Color.GREEN)
                    }
                    2 -> {
                        binding.answerButtonTwo.setBackgroundColor(Color.GREEN)
                    }
                    3 -> {
                        binding.answerButtonThree.setBackgroundColor(Color.GREEN)
                    }
                    4 -> {
                        binding.answerButtonFour.setBackgroundColor(Color.GREEN)
                    }
                }
                if (trueAnswer == answer) {
                    count_true_answer++
                } else {
                    false_Answer_count++
                }
                boolean_count_answer = false
                binding.trueAnswerText.text = "True answer:     $count_true_answer/10"
                binding.falseAnswerText.text = "False answer:       ${false_Answer_count}/10"
                binding.answerButtonThree.isEnabled = false
                binding.answerButtonFour.isEnabled = false
                binding.answerButtonOne.isEnabled = false
                binding.answerButtonTwo.isEnabled = false
                binding.buttonNextOrContinue.setText(R.string.Continue_games)
                if (count_question >= 10) {
                    binding.buttonNextOrContinue.setText(R.string.Finish)
                }
            } else if (binding.buttonNextOrContinue.text == "Finish") {
                val score = Intent(this, MainActivity21::class.java)
                score.putExtra("quiz_number", a)
                score.putExtra("text_view_visibility", b)
                score.putExtra("image_view_visibility", c)
                score.putExtra("true_answer_result", count_true_answer)
                Toast.makeText(this, "$count_true_answer/10", Toast.LENGTH_SHORT).show()
                startActivity(score)
                finish()
            }
        }
    }

    fun allBUttonColorBlue() {
        binding.answerButtonFour.setBackgroundColor(Color.BLUE)
        binding.answerButtonOne.setBackgroundColor(Color.BLUE)
        binding.answerButtonTwo.setBackgroundColor(Color.BLUE)
        binding.answerButtonThree.setBackgroundColor(Color.BLUE)
    }

    private fun WhenIntent(forWhen: Int) {
        var r: String = ""
        var w = 0
        when (forWhen) {
            1 -> {
                var d: Int = (Math.random() * 4 + 1).toInt()
                when (d) {
                    1 -> {

                        var a: Int = (Math.random() * 100).toInt()
                        var b: Int = (Math.random() * 100).toInt()
                        r = "$a + $b = ?"
                        w = a + b
                        binding.answerButtonOne.text = "${random_answer(w)}"
                        binding.answerButtonTwo.text = "${random_answer(w)}"
                        binding.answerButtonThree.text = "${random_answer(w)}"
                        binding.answerButtonFour.text = "${random_answer(w)}"
                        binding.answerButtonOne.text = "$w"
                        trueAnswer = 1
                    }
                    2 -> {
                        var a: Int = (Math.random() * 100).toInt()
                        var b: Int = (Math.random() * 100).toInt()
                        r = "$a - $b = ?"
                        w = a - b
                        binding.answerButtonOne.text = "${random_answer(w)}"
                        binding.answerButtonTwo.text = "${random_answer(w)}"
                        binding.answerButtonThree.text = "${random_answer(w)}"
                        binding.answerButtonFour.text = "${random_answer(w)}"

                        binding.answerButtonTwo.text = "$w"
                        trueAnswer = 2
                    }
                    3 -> {
                        var a: Int = (Math.random() * 100).toInt()
                        var b: Int = (Math.random() * 100).toInt()
                        r = "$a x $b = ?"
                        w = a * b
                        binding.answerButtonOne.text = "${random_answer(w)}"
                        binding.answerButtonTwo.text = "${random_answer(w)}"
                        binding.answerButtonThree.text = "${random_answer(w)}"
                        binding.answerButtonFour.text = "${random_answer(w)}"
                        binding.answerButtonThree.text = "$w"
                        trueAnswer = 3
                    }
                    /*kjsndvnx,fmvnz,mxcgi*/
                    4 -> {
                        var q = true
                        var a: Int = 1
                        var b: Int = 1
                        while (q) {
                            a = (Math.random() * 100).toInt()
                            b = (Math.random() * 100).toInt()
                            if (b != 0 && a != 0 && a % b == 0) {
                                q = false
                            }
                        }
                        r = "$a / $b = ?"
                        w = a / b
                        binding.answerButtonOne.text = "${random_answer(w)}"
                        binding.answerButtonTwo.text = "${random_answer(w)}"
                        binding.answerButtonThree.text = "${random_answer(w)}"
                        binding.answerButtonFour.text = "${random_answer(w)}"
                        binding.answerButtonFour.text = "$w"
                        trueAnswer = 4
                    }
                }
                binding.questionText.text = r

            }
            2 -> {

            }
            3 -> {
                saveListQuestionCountry = SaveListClassQuestionCountry.showList()
                saveListQuestionCountry.shuffle()
                binding.questionText.text =
                    saveListQuestionCountry[countQuestionList_country].question_country
                binding.answerButtonOne.text =
                    saveListQuestionCountry[countQuestionList_country].center_answer_country_one
                binding.answerButtonTwo.text =
                    saveListQuestionCountry[countQuestionList_country].center_answer_country_two
                binding.answerButtonThree.text =
                    saveListQuestionCountry[countQuestionList_country].center_answer_country_three
                binding.answerButtonFour.text =
                    saveListQuestionCountry[countQuestionList_country].center_answer_country_four
                trueAnswer = saveListQuestionCountry[countQuestionList_country].true_answer_country
                countQuestionList_country++

            }


        }
        count_question++
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        super.onBackPressed()
    }

    fun random_answer(a: Int): Int {
        var d = a
        if (a <= 4 && a >= -4 && a!=-1) {
            d = a * 10 + 10
        }else if(a==-1)
            d = a*10
        while (true) {
            var b: Int = (Math.random() * 2 * d).toInt()
            if (a != b) {
                return b
            }
        }
    }


}






