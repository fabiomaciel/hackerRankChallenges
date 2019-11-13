package io.github.gb.fabiomaciel

/*
 * Complete the 'countPalindromes' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun countPalindromes(s: String): Int {
    var count = s.length;
    for(start in 0 .. s.length-2) {
        val substr = s.substring(start, start+2)
        if(isPalindrome(substr)) count++
    }

    for(size in 3 .. s.length) {
        for (start in 0..s.length - size) {
            val substr = s.substring(start, start+size)
            if(isPalindrome(substr)) count++
        }
    }

    return count
}

fun isPalindrome(str: String) : Boolean{
    for(i in 0 until str.length/2){
        if(str[i] != str[str.length-(i+1)]) return false
    }
    return true
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = countPalindromes(s)

    println(result)
}
