package io.github.fabiomaciel

import java.util.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>, counter: Int = 0, index: Int = 0): Int {
    return if (index == c.size - 1) {
        counter
    } else if (c.size > index + 2 && c[index + 2] == 0) {
        jumpingOnClouds(c, counter + 1, index + 2)
    } else {
        jumpingOnClouds(c, counter + 1, index + 1)
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = jumpingOnClouds(c)
    println(result)
}
