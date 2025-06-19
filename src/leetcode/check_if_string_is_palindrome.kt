package leetcode

fun main() {
    val s = "hhahh"
    val result = isPalindrome(s)
    print(result)
}

fun isPalindrome(s: String): Boolean {
    val cleanedString = s.lowercase().filter { it.isLetterOrDigit() }
    val charArray = cleanedString.toCharArray()

    var left = 0
    var right = charArray.size - 1

    while (left < right) {
        if (charArray[left] != charArray[right]) {
            return false
        }
        left++
        right--
    }
    return true
}