package leetcode

fun main() {
    val result = frequencySort("tree")
    print(result)
}

fun frequencySort(s: String): String {
    val charCounts = mutableMapOf<Char, Int>()
    for (char in s) {
        charCounts[char] = charCounts.getOrDefault(char, 0) + 1
    }
    val sortedChars = charCounts.entries.sortedWith(
        compareByDescending { it.value }
    )

    val resultBuilder = StringBuilder()
    for ((char, count) in sortedChars) {
        for (i in 0 until count) {
            resultBuilder.append(char)
        }
    }

    return resultBuilder.toString()
}