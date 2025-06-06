package patterns.arrays.twopointers.myapproach

fun main() {
    val charArr = charArrayOf('o', 'l', 'l', 'e', 'h')
    reverseString(charArr)
}

fun reverseString(s: CharArray) {
    var left = 0
    var right = s.size - 1

    while (left < right) {
        s[right] = s[left].also { s[left] = s[right] }
        left++
        right--
    }
    print(s)
}