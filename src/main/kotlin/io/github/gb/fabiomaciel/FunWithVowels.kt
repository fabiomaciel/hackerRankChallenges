package io.github.gb.fabiomaciel
/*
 * Complete the 'longestVowelSubsequence' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

val vowelList= listOf('a', 'e', 'i', 'o', 'u')

fun hasAllVowels(s: String) : Boolean{
    for(vowel in vowelList) if(!s.contains(vowel)) return false
    return true
}

fun longestVowelSubsequence(s: String): Int {

    var str = s.toMutableList()
    var currentVowel = 0

    var i = 0
    var atLeaseOne = false;
    while(i < str.size){
        if(!hasAllVowels(s)) return 0
        if(str[i] != vowelList[currentVowel]){
            if(currentVowel < (vowelList.size-1) && atLeaseOne && str[i] == vowelList[currentVowel+1]) {
                currentVowel++
                atLeaseOne = false
            }else{
                str.removeAt(i)
            }
            continue
        }
        atLeaseOne = true
        i++
    }

    return i
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = longestVowelSubsequence(s)

    println(result)
}
