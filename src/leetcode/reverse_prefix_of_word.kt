package leetcode


fun main() {
    val word = "aacvdiigf"
    val ch = 'd'

    val result = reversePrefix(word, ch)
    print(result)
}
fun reversePrefix(word: String, ch: Char): String {
    val charArray = word.toCharArray()
    var index = -1

    for(i in charArray.indices){
        if(charArray[i] == ch){
            index = i
            break
        }
    }
    if(index != -1) {
        var left = 0
        var right = index
        while(left<right){
            val temp = charArray[right]
            charArray[right] = charArray[left]
            charArray[left] = temp
            left++
            right--
        }
    }
    return String(charArray)
}