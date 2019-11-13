package io.github.gb.fabiomaciel
/*
 * Complete the 'shortestSubstring' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun shortestSubstring(s: String): Int {
    // Write your code here
    val set = mutableSetOf<Char>()
    for (i in 0 until s.length){
        set.add(s[i])
    }

    for(size in set.size until s.length){
        for(start in 0 .. s.length-size){

            val substr = s.substring(start, start+size)
            var match = true
            for(char in set){
                if(!substr.contains(char)) match = false
            }
            if(match){
                return substr.length
            }

        }
    }
    return s.length
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = shortestSubstring(s)

    println(result)

}
