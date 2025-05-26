package patterns.slidingwindow.myapproach.variablesize

fun main() {
    val s = "bbbbb"
    val map = mutableMapOf<Char, Int>()
    var start = 0
    var maxLen = 0

    for (end in s.indices) {
        val ch = s[end]
        map[ch] = map.getOrDefault(ch, 0) + 1

        while(map[ch]!! > 1) {
            val leftChar = s[start]
            map[leftChar] = map[leftChar]!! - 1
            start++
        }
        maxLen = maxOf(maxLen, end - start + 1)
    }
    print(maxLen)
}