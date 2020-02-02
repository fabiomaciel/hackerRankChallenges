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
        if(isPalindrome(s, start, 2)) count++
    }

    for(size in 3 .. s.length) {
        for (start in 0..s.length - size) {
            if(isPalindrome(s, start, size)) count++
        }
    }
    return count
}

fun isPalindrome(str: String, start: Int, size: Int) : Boolean{
    for(i in 0 until size/2){
        if(str[i+start] != str[start+size-(i+1)]) return false
    }
    return true
}

fun main() {
    val s = readLine()!!

    val result = countPalindromes(s)

    println(result)
}
