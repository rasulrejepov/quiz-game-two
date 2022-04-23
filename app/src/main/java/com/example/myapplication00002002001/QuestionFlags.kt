package com.example.myapplication00002002001

class QuestionFlags {

    var flag : Int = 0
    var answer_one:String = ""
    var answer_two:String = ""
    var answer_three:String = ""
    var answer_four:String = ""
    var true_answer:Int = 0

    constructor(
        flag: Int,
        answer_one: String,
        answer_two: String,
        answer_three: String,
        answer_four: String,
        true_answer: Int
    ) {
        this.flag = flag
        this.answer_one = answer_one
        this.answer_two = answer_two
        this.answer_three = answer_three
        this.answer_four = answer_four
        this.true_answer = true_answer
    }

    constructor()


}