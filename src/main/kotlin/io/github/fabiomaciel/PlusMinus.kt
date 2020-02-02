import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    val size = arr.size.toDouble()
    val positive = arr.filter { it > 0 }.size / size
    val negative = arr.filter { it < 0 }.size / size
    val zeros = arr.filter { it == 0 }.size / size

    listOf<Double>(positive, negative, zeros).map {
        println("%.6f".format(it))
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
