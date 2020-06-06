package io.github.fabiomaciel

import java.util.*

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    return valleyCounter(0, s)
}

fun valleyCounter(index: Int, s: String, valleyCount: Int = 0, altitude: Int = 0): Int {
    if (index == s.length) return valleyCount
    if (s[index] == 'D') return valleyCounter(index + 1, s, increaseValley(altitude, valleyCount), altitude - 1)
    return valleyCounter(index + 1, s, valleyCount, altitude + 1)
}

fun increaseValley(altitude: Int, valleyCount: Int): Int {
    if (altitude == 0) return valleyCount + 1
    return valleyCount
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
