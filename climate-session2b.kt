// Session #2B (60min): Coding incl. Tests-(CS Fundamentals, Data Structures and Algorithms) - Problem solving with code. Understanding test basics.
/*
Your previous Plain Text content is preserved below:

/*

Write a program which takes one number(current) at a time, persist that number, and returs top five numbers(including the current number) on each invocation. call site invocation will be similar to this

int[]topFiveNumbers=myObject.add(aNewNumber);
if less than 5 number to return it will be an array with less than 5 elements.
the returned numbers may or may not be sorted.

specify time and space complexity for your solution

write unit test for it.
*/
 */

import java.io.*;
import java.util.*;

val mainNumbers = mutableListOf<Int>()

fun main() {
    for (i in 1..5) println(topFiveNumbers(i, mainNumbers).toString())
    println("Tests:")
    println(testFunctionMustReturnFiveElementsEvenWithSixNumbers().toString())
    println(testFunctionMustReturnTopFiveElements().toString())
    println(testFunctionMustReturnAllElementsIfThereIsLessOfFive().toString())
}

fun topFiveNumbers(number : Int, numbers : MutableList<Int>) : List<Int> {
    // Note: this don't work if the numbers list is not ordered from the beginning
    var positionNotFound = true
    var index = 0
    while((index < numbers.size) and (positionNotFound)) {
        if (numbers[index] > number) {
            numbers.add(index, number)
            positionNotFound = false
        }

        index++
    }

    if (positionNotFound) {
        numbers.add(number)
    }

    return numbers.takeLast(5)
    // how can we better the time complexity?
    // we dont need the result to be sorted
    // we are sorting the whole numbers. where we only need 5, total number can be very large...

    // Solution 1:
    //numbers.add(number)
    //return numbers.sortedDescending().take(5)
}

fun testFunctionMustReturnFiveElementsEvenWithSixNumbers() : Boolean {
    val testNumbers = mutableListOf<Int>(1,2,3,4,5)
    return (topFiveNumbers(6, testNumbers).size == 5)
}

fun testFunctionMustReturnTopFiveElements() : Boolean {
    val testNumbers = mutableListOf<Int>(2,3,4,5,6)
    return (!topFiveNumbers(1, testNumbers).contains(1))
}


fun testFunctionMustReturnAllElementsIfThereIsLessOfFive() : Boolean {
    val testNumbers = mutableListOf<Int>()
    return (topFiveNumbers(6, testNumbers).size == 1)
}


sealed class Units {
    String mm : Unit
    String cm : Unit
    String m : Unit
    String km : Unit
    String inch : Unit
    String ft : Unit
    String mi : Unit
}

val metricUnits = listOf("mm", "cm", "m", "km")
val imperialUnits = listOf("inch", "ft", "mi")


/*sealed class ImperialUnit {
  Double inch : Unit
  Double ft : Unit
  Double mi : Unit
}*/


fun main() {
    val leftValue = 3.0
    val leftUnits = "cm"
    val rightUnits = "inch"
    val rightValue = convert(leftValue, leftUnits, rightUnits)

    println("${leftValue} ${leftUnits} = ${rightValue} ${rightUnits}" )
}

fun convert(leftValue: Double, leftUnits: String, rightUnits: String): Double {
    if ((leftUnits in metricUnit) && (rightUnits in metricUnit)) {
        return 1
    }

    return 1.1
}

fun toStandar(value: Double, unit: Units): Double {
    when (unit) {

    }
    return value * 2.54
}

fun InToCm(value: Double): Double {
    return value * 2.54
}
