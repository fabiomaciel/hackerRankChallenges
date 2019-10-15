package io.github.fabiomaciel

fun main(vararg args: String) {
    val x = saveThePrisoner(3, 3, 3)
    println(x)
}

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    return (s - 1 + m - 1) % n + 1
}

