package io.github.fabiomaciel

import java.util.Scanner
import java.util.regex.Pattern

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    val noon = s.substring(s.length-2)
    val time = s.substring(2, s.length-2)
    var hour = s.substring(0, 2).toInt()

    if(noon == "PM" && hour != 12)
        hour += 12
    else if(noon == "AM" && hour == 12)
        hour = 0


    val prefix = if(hour < 10) "0" else ""
    return "$prefix$hour$time"
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()
    val result = timeConversion(s)

    println(result)
}