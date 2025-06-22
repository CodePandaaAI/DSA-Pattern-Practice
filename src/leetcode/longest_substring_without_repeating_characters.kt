package leetcode

fun main() {
    val s = "acacssss"
    val map = hashMapOf<Char, Int>()

    var left = 0
    var maxLen = 0

    for (right in s.indices) {
        val ch = s[right]
        map[ch] = map.getOrDefault(ch, 0) + 1

        while(map[ch]!! > 1){
            val start = s[left]
            map[start] = map[start]!! - 1
            left++
        }
        maxLen = maxOf(maxLen, right - left + 1)
    }
    print(maxLen)
}