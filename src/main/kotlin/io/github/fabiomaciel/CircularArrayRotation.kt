package io.github.fabiomaciel

import java.util.*

fun main(vararg args: String) {
    val x = circularArrayRotation(arrayOf(1, 2, 3), 2, arrayOf(0, 1, 2))
    x.forEach { println(it) }
}

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    val list = LinkedList<Int>()
    a.forEach { list.add(it) }
    for (i in 0 until k) {
        list.addFirst(list.pop())
    }
    val x = Array<Int>(queries.size) { 0 }
    var y = 0;
    queries.forEach { x[y++] = list.get(it) }
    return x
}


