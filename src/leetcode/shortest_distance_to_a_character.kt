package leetcode

fun main() {
    val s = "loveleetcode"
    val c = 'e'
    val result = shortestToChar(s, c)
    print(result)
}

fun shortestToChar(s: String, c: Char): IntArray {
    val n = s.length
    val answer = IntArray(n)
    var prev = -n

    for (i in 0 until n) {
        if (s[i] == c) {
            prev = i
        }
        answer[i] = i - prev
    }

    prev = 2 * n

    for (i in n - 1 downTo 0) {
        if (s[i] == c) {
            prev = i
        }
        answer[i] = minOf(answer[i], prev - i)
    }

    return answer
}