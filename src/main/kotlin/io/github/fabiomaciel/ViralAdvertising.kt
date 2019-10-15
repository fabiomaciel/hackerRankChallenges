package io.github.fabiomaciel

fun main(vararg args: String) {
    val advertising = viralAdvertising(5)
    println(advertising)
}

fun viralAdvertising(n: Int): Int {
    var fanbase = 5;
    fanbase /= 2
    var total = fanbase
    for (i in 1 until n) {
        fanbase = (fanbase * 3) / 2
        total += fanbase
    }
    return total
}

