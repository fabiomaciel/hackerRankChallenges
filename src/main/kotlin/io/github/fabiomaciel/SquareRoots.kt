package io.github.fabiomaciel

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

object CountSquares {

    fun countSquares(a: Int, b: Int): Int {
        var cnt = 0 // Initialize result

        // Traverse through all numbers
        for (i in a..b)

        // Check if current number 'i' is perfect
        // square
        {
            var j = 1
            while (j * j <= i) {
                if (j * j == i)
                    cnt++
                j++
            }
        }
        return cnt
    }

    fun countSquares2(a: Int, b: Int) =
        floor(sqrt(b.toDouble())) - ceil(sqrt(a.toDouble())) + 1

}

fun main(args: Array<String>) {
    val a = 17
    val b = 24
    print("Count of squares is " + CountSquares.countSquares2(a, b))
}
