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
                println("Good morning, $userName")
            } else if (hour >= 20) {
                println("Hello, $userName ")
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

// While statement
/*The while statement will print the body for as long as its condition returns true.
That means you should not use while conditions with a predicate that will always return true.
Such a code will run forever unless you stop it.*/
        var toBePrinted = true
        while (toBePrinted) {
            println("Will be printed once")
            toBePrinted = false
        }
//Here is a code that calls its body for numbers from 0 to 2.
        var printedTimes = 0
        while (printedTimes <= 2) {
            println("Line $printedTimes")
            printedTimes += 1
        }
//sequence start at 0, go up by 7 each step and stop before gets larger than 100
        var num = 0
        while (num < 100) {
            println(num)
            num += 7
        }
/*sequence start at 1 and each next number will be two times bigger,
    stops if the number is bigger than 100*/
        var multiplier = 1
        while (multiplier <= 100) {
            println(multiplier)
            multiplier *= 2
        }
/*sequence of the squares of all the whole numbers and
        stop the sequence before the squared value is greater than 100*/
        var i = 1
        while (i * i <= 100) {
            println(i * i)
            i++
            // or i += 1
            // or i = i + 1
        }
//sequence start at 0 and each number until 5
        var n = 0
        while (n < 5) {
            println(n)
            n ++
        }

//-- for-loop --
// call code for each number from a to b, including b
        val a = 0
        val b = 5
        for (i in a..b) {
            println(i)
        }
//call code for each number from c to d, excluding d
        val c = 0
        val d = 5
        for (i in c until d) {
            println(i)
        }
//code for each number from e to f, where e is bigger than f, and the step should be -1
        val e = 5
        val f = 0
        for (i in e downTo f) {
            println(i)
        }
//code for each number from g to h, with g step j
        val g = 0
        val h = 10
        val j = 3
        for (i in g..h step j) {
            println(i)
        }
//code for each number from k to l, excluding l, with a step m
        val k = 0
        val l = 9
        val m = 3
        for (i in k until l step m) {
            println(i)
        }
//code for each number from o to p, where o is bigger than p, with a step -3
        val o = 10
        val p = 1
        val q = 3
        for (i in o downTo p step q) {
            println(i)
        }
//You can use this to generate the text for a silly song
        for (numb in 5 downTo 1) {
            println("$numb lemonades are left")
            println("Glupglupglup")
        }
        println("That is it")
        println("Now I have to go")

//Nested loops
// you can have a for loop inside another for loop
/* the outer for loop invokes its body five times and
for every single one of those times, the inner for loop prints its body five time as well
for r equals 1, prints all the possible s values.
for r equals 2, prints all the possible s values, the same for r equals 3,4 and 5
 */
        for (r in 1..5) {
            for (s in 1..5){
                println("$r $s")
            }
        }
/* print a triangle of stars in the first row one star,
in the second row, there are two stars until five stars
*
**
***
****
*****
*/
        for (t in 1..5) {
            for (u in 1..t) {
                print("*")
            }
            println()
        }
/* downTo function
print a upside down triangle of stars
*****
****
***
**
*
 */
        for (v in 1..5) {
            val numberOfStars = 6 - v
            for (i in 1..numberOfStars) {
                print("*")
            }
            println()
        }
        val height = 10
        for (numOfStars in height downTo 1) {
            for (i in 1..numOfStars) {
                print("*")
            }
            println()
        }
/* print a different shape with stars
*
***
*****
***
*
 */
        val width = 5
        for (stars in 1 until width step 2) {
            for (i in 1..stars) {
                print("*")
            }
            println()
        }
        for (stars in width downTo 1 step 2) {
            for (i in 1..stars) {
                print("*")
            }
            println()
        }
/* print the following triangle
    *
   **
  ***
 ****
*****
So let's use a for-loop, where the i variable is the number of rows.
In the first row, you need 4 spaces and 1 star. In the second row, you need 3 spaces and 2 stars.
In the third row, you need 2 spaces and 3 stars. Did you notice the pattern?
The number of spaces should be 5 - w, and the number of stars should be w
 */
        for (w in 1..5) {
            val numberOfSpaces = 5 - w
            for (i in 1..numberOfSpaces) {
                print(" ")
            }
            val numbOfStars = w
            for (i in 1..numbOfStars) {
                print("*")
            }
            println()
        }
/* print an isosceles triangle that should look as follows
    *
   ***
  *****
 *******
*********
You need to print the same number of spaces as before,
but the number of stars should increase quicker
 */
        for (x in 1..5) {
            val numOfSpaces = 5 - x
            for (i in 1..numOfSpaces) {
                print(" ")
            }
            val countOfStars = x * 2 - 1
            for (i in 1..countOfStars) {
                print("*")
            }
            println()
        }
/* display the following triangle built using star symbols
*****
 ****
  ***
   **
    *
 */
        for (y in 5 downTo 1) {
            val numOfSpaces = 5 - y
            for (i in 1..numOfSpaces) {
                print(" ")
            }
            for (i in 1..y) {
                print("*")
            }
            println()
        }
//other solution
        for (i in 1..5) {
            val countOfSpaces = i - 1
            for (j in 1..countOfSpaces) {
                print(" ")
            }
            val numberOfStars = 6 - i
            for (j in 1.. numberOfStars) {
                print("*")
            }
            println()
        }
/*
display the triangle shape below
*********

 *******

  *****

   ***

    *
 */
        for (i in 5 downTo 1){
            val space = 5 - i
            for (j in 1..space) {
                print(" ")
            }
            val star = i * 2 - 1
            for (j in 1..star) {
                print("*")
            }
            println()
            println()
        }
/* display the triangle shape below
    *

   **

  ***

 ****

*****

 ****

  ***

   **

    *
 */
        for (i in 1 until 5) {
            val jump = 5 - i
            for (j in 1..jump) {
                print(" ")
            }
            for (l in 1..i) {
                print("*")
            }
            println()
            println()

        }
        for (i in 1..5) {
            val jumpSpace = i - 1
            for (k in 1..jumpSpace){
                print(" ")
            }
            val starShine = 6 - i
            for (m in 1..starShine){
                print("*")
            }
            println()
            println()
        }
    }
}