package io.github.fabiomaciel

import java.lang.StringBuilder
import java.util.*

// Complete the staircase function below.
fun staircase(n: Int): Unit {
    for(i in 1..n){
        println("${NCharacters(" ",n - i)}${NCharacters("#",i)}")
    }
}

fun NCharacters(str: String, n: Int): String{
    val builder = StringBuilder()
    for(i in 1..n){
        builder.append(str)
    }
    return builder.toString()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)

}


