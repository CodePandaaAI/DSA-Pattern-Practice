package patterns.slidingwindow.myapproach.variablesize

fun main() {
    val s = "eceba"
    val k = 2
    val map = mutableMapOf<Char, Int>()
    var start = 0
    var maxLen = 0

    for (end in s.indices) {
        val ch = s[end]
        map[ch] = map.getOrDefault(ch, 0) + 1

        while (map.size > k) {
            val startChar = s[start]
            map[startChar] = map[startChar]!! - 1
            if (map[startChar] == 0) {
                map.remove(startChar)
            }
            start++
        }

        maxLen = maxOf(maxLen, end - start + 1)
    }

    println("Longest substring length with at most $k distinct characters: $maxLen")
}
