// Session #3B (60min): Software Architecture & Design Principles - What is good software architecture, sound design for scalability, maintainability, etc.
import java.io.*;
import java.util.*;

// To execute Kotlin code, please define a top level function named main

/*sealed class Units {
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


sealed class ImperialUnit {
  Double inch : Unit
  Double ft : Unit
  Double mi : Unit
}*/


fun main() {
    val leftValue = 3.0
    val leftUnits = "cm"
    val rightUnits = "inch"
    val rightValue = convert(leftValue, leftUnits, rightUnits)


    val cm1 = 3
    val cm2 = 4
    val cm3 = 5
    val cm4 = 6
    val cm5 = 7

    val sumInInches = 0.0 // ????




    (0..100000).forEach {
        convert(leftValue, leftUnits, rightUnits)
    }

    println("${leftValue} ${leftUnits} = ${rightValue} ${rightUnits}" )
}

fun convert(leftValue: Double, leftUnits: String, rightUnits: String): Double {
    if (leftUnits == rightUnits) {
        return leftValue
    }

    var standar = toStandar(leftValue, leftUnits)

    return standarToFinalUnit(standar, rightUnits)
}


interface Converter {

    fun toStarndard(value: Double): Double
    fun fromStandard(value: Double): Double
}

class Meters:Converter {

    fun toStandard(value: Double):Double {
        return value * 100; // to CM

    }

    fun fromStandard(value: Double): Double {
        return value / 100 // CM to...
    }

}

class Inches:Converter {

    fun toStandard(value: Double):Double {
        return value / 2.54 // to cm

    }

    fun fromStandard(value: Double): Double {
        return value * 2.54
    }

}


fun toStandar(value: Double, unit: String): Double {
    if (unit == "mm") {
        return value / 10
    }
    if (unit == "cm") {
        return value
    }
    if (unit == "m") {
        return value * 100
    }
    if (unit == "km") {
        return value * 100000
    }
    if (unit == "inch") {
        return value * 2.54
    }
    if (unit == "ft") {
        return value * 30.48
    }
    if (unit == "mi") {
        return value * 160934
    }

    return 0.0
}

fun standarToFinalUnit(value: Double, unit: String): Double {
    if (unit == "mm") {
        return value / 0.01
    }
    if (unit == "cm") {
        return value
    }
    if (unit == "m") {
        return value / 100
    }
    if (unit == "km") {
        return value / 100000
    }
    if (unit == "inch") {
        return value / 2.54
    }
    if (unit == "ft") {
        return value / 30.48
    }
    if (unit == "mi") {
        return value / 160934
    }

    return 0.0
}

/**
Task:

Create a system that can handle converting from 1 system of measurement into another. For instance, you are given a measurement of 3 inches. Convert 3 inches to “x feet”, “x cm”, and “x inches”.

Requirements:
Just like Google conversions, the system should be able to handle all basic conversions of:

Metric
mm
cm
m
km

Imperial
in = 2.54 cm
ft = 12 in
mi = 5280 ft

Discuss:
What are some of the pros/cons of the approach chosen? Are there other approaches that could work? What would be their pros/cons?

 **/

