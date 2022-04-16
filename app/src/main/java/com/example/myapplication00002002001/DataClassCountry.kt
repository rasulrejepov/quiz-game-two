package com.example.myapplication00002002001

 class DataClassCountry {
    var id_question_country : Int = 0
    var question_country:String = ""
    var center_answer_country_one:String = ""
    var center_answer_country_two:String = ""
    var center_answer_country_three:String = ""
    var center_answer_country_four:String = ""
    var true_answer_country:Int = 0

     constructor(
         id_question_country: Int,
         question_country: String,
         center_answer_country_one: String,
         center_answer_country_two: String,
         center_answer_country_three: String,
         center_answer_country_four: String,
         true_answer_country: Int
     ) {
         this.id_question_country = id_question_country
         this.question_country = question_country
         this.center_answer_country_one = center_answer_country_one
         this.center_answer_country_two = center_answer_country_two
         this.center_answer_country_three = center_answer_country_three
         this.center_answer_country_four = center_answer_country_four
         this.true_answer_country = true_answer_country
     }

     constructor()

 }