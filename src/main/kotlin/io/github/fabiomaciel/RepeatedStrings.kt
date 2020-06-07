package io.github.fabiomaciel

import java.util.*

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
    return countAsInWord(s).toLong() *
            (n / s.length) +
            countAsInWord(s) { it < (n % s.length).toInt() }.toLong()
}

fun countAsInWord(word: String, block: (Int) -> Boolean = { true }) =
    word.filterIndexed { index, c -> c == 'a' && block(index) }.length

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()
    val n = scan.nextLine().trim().toLong()
    val result = repeatedString(s, n)
    println(result)
}
