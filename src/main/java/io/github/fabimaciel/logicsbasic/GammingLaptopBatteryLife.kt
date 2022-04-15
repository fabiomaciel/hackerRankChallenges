package io.github.fabimaciel.logicsbasic


/*
 * Complete the 'getBattery' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY events as parameter.
 */

fun getBattery(events: Array<Int>): Int {
    return (arrayOf(50) + events).reduce { sum, event ->
        sumUntil100(sum, event)
    }
}

fun sumUntil100(n1: Int, n2: Int) =
    (n1 + n2).let {
        when {
            it > 100 -> 100
            it < 0 -> 0
            else -> it
        }
    }


fun main(args: Array<String>) {
    val eventsCount = readLine()!!.trim().toInt()

    val events = Array<Int>(eventsCount, { 0 })
    for (i in 0 until eventsCount) {
        val eventsItem = readLine()!!.trim().toInt()
        events[i] = eventsItem
    }

    val result = getBattery(events)

    println(result)
}
