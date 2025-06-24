package leetcode

fun main() {
    val result = longestCommonPrefix(arrayOf("z","racecar","car"))
    print(result)
}

fun longestCommonPrefix(strs: Array<String>): String {
    var smallest = strs[0]
    for (str in strs) {
        if (str.length < smallest.length) smallest = str
    }
    strs.sort()
    println(strs.toList())

    val commonPrefix = mutableListOf<Char>()
    for (char in 0..smallest.length - 1) {
        var found = false
        for (str in 0..strs.size - 1) {
            val string = strs[str]
            println("Value of String: $string")
            if (string[char] == smallest[char]) {
                found = true
                println(commonPrefix)
            }
            else return commonPrefix.joinToString("")
            println("Value Of: Found: $found")
            println(commonPrefix)
        }
        if (found) commonPrefix.add(smallest[char])
    }

    return commonPrefix.joinToString("")
}