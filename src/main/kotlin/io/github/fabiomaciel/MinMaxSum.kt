package io.github.fabiomaciel

import java.util.*

fun miniMaxSum(arr: Array<Int>): Unit {
    val (min, max) = minMaxLogic(arr)
    println("$min $max")
}

fun minMaxLogic(arr: Array<Int>): Pair<Long, Long>{
    arr.sort()
    var sum: Long = 0
    arr.forEach { sum += it }
    return Pair(sum-arr.last(),sum-arr.first())
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    miniMaxSum(arr)
}