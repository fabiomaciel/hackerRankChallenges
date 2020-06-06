package io.github.fabiomaciel

import java.util.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    return sockMerchantCounter(ar.sortedArray(), ar.size - 1)
}

fun sockMerchantCounter(arr: Array<Int>, index: Int, count: Int = 0): Int {
    return when {
        index < 1 -> count
        arr[index] == arr[index - 1] -> sockMerchantCounter(arr, index - 2, count + 1)
        else -> sockMerchantCounter(arr, index - 1, count)
    }

}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
