package com.micp.conditionsandloops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //        If and if-else statements
        val finishedHomework2 = true
        if (finishedHomework2) {
            println("Can go to the cinema")
        } else {
            println("Cannot go to the cinema")
        }

        val haveSomeExtraMoney = true
        val tip: Double =
            if (haveSomeExtraMoney) {
                10.0
            } else {
                0.0
            }
        println(tip) // 10.0

//        Inside if-else bodies, you can include more than one statement.
//        The value returned by a body is the last expression it has.
        val haveSomeExtraMoney2 = true
        val tip2: Double =
            if (haveSomeExtraMoney2) {
                println("Here you go") // Here you go
                1.0 // this value is ignored, because it is not the last one
                5.0 // this value is ignored, because it is not the last one
                10.0
            } else {
                println("Sorry, I am broke")
                0.0
            }
        println(tip2) // 10.0

//        However, if you have only one expression in your body, you can skip braces.
        val haveSomeExtraMoney3 = true
        val tip3: Double = if (haveSomeExtraMoney3) 10.0 else 0.0
        println(tip3) // 10.0

//        If-else-if is a popular structure in many languages but not in Kotlin.
//        This is because there is a better alternative, called the when statement,
//        but it's good to know how to use if-else-if in case you ever need it
        println("Is it going to rain?")
        val probability = 70
        if (probability <= 40) {
            println("Unlikely")
        } else if (probability <= 80) {
            println("Likely")
        } else if (probability < 100) {
            println("Yes")
        } else {
            println("What?")

            val hour = 9
            val userName = "Alex"
            if (hour <= 10) {
                println("Good morning,")
            } else if (hour >= 20) {
                println("Hello, ")
            } else {
                println("Hello, ")
            }
        }

        //use when to verify a password
        val password = ""
        when {
            password == "" -> {
                println("Password cannot be empty")
            }
            password.length < 7 -> {
                println("This password is quite short")
            }
            else -> {
                println("This password is OK")
            }
        }
        //work with when in a better syntax with the last example
        //when can also be used as an expression,
        // instead of print a value, you can just return the value.
        //When the body of the branch has a single value or expression
        //you can eliminate the braces
        val password2 = ""
        val textToShow = when {
            password2 == "" -> "Password cannot be empty"
            password2.length < 7 -> "This password is quite short"
            else -> "This password is OK"
        }
        println(textToShow)

        val number = 0
        val numberToShow = when (number) {
            1 -> "One"
            2 -> "Two"
            else -> "Big"
        }
        println(numberToShow)

        //Comparing String values
//        val hasAccess = when (userRole) {
//            "admin" -> true
//            " " -> false
//            else -> documentOwnerId == userId
//        }

        val text = when (val number2 = 3) { // or 2, 3, 4, 5, 6
            1 -> "Missed hit"
            in 2..5 -> "Hit with value $number2"
            6 -> "Critical hit"
            else -> "Unsupported value"
        }
        println(text)

        val weekday = "Friday"
        val hour = 20
        println("On $weekday, the opening hours are:")
        println()
        if (weekday == "Monday") {
            println("8 AM to 12 PM")
        } else if (weekday == "Tuesday") {
            println("8 AM to 6 PM")
        } else if (weekday == "Wednesday") {
            println("8 AM to 6 PM")
        } else if (weekday == "Thursday") {
            println("8 AM to 6 PM")
        } else if (weekday == "Friday") {
            println("8 AM to 21.00 h.")
        } else if (weekday == "Saturday") {
            println("9 AM to 16.00")
        } else if (weekday == "Sunday") {
            println("8 AM to 4 PM")
        }

        val openingHours = when (weekday) {
            "Monday" -> "8 AM to 12 PM"
            "Tuesday" -> "8 AM to 6 PM"
            "Wednesday" -> "8 AM to 6 PM"
            "Thursday" -> "8 AM to 6 PM"
            "Friday" -> "8 AM to 21.00 h."
            "Saturday" -> "9 AM to 16.00"
            "Sunday" -> "8 AM to 4 PM"
            else -> {
                "is closed"
            }
        }
        println(openingHours)

        val isOpen = when (weekday) {
            "Monday" -> hour in 8..12
            "Tuesday" -> hour in 8..18
            "Wednesday" -> hour in 8..18
            "Thursday" -> hour in 8..18
            "Friday" -> hour in 8..21
            "Saturday" -> hour in 9..16
            "Sunday" -> hour in 8..16
            else -> false
        }
        if (isOpen) {
            println("Little Lemon is open now")
        } else {
            println("Little Lemon is closed now")
        }
    }
}