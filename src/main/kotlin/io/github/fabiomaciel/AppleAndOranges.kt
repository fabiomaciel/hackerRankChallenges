package io.github.fabiomaciel

object AppleAndOranges {
    @JvmStatic
    fun main(vararg args: String){
        val apples = "-2 2 1".splitToArray()
        val oranges = "5, -6".splitToArray()

        countApplesAndOranges( 7, 11, 5, 15, apples,oranges)
    }
}

fun String.splitToArray() = split(" ").map{ it.trim().toInt() }.toTypedArray()

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    listOf(Pair(a, apples), Pair(b, oranges)).forEach { (tree, fruits) ->
        println(fruits.filter { (tree+it).isBetween(s, t) }.size)
    }
}

fun Int.isBetween(s: Int, t: Int) = this in s..t