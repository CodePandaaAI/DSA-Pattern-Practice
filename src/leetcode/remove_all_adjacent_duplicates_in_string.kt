package leetcode

fun main() {
    val s = "abbaca"
    val result = removeDuplicates(s)
    print(result)
}
fun removeDuplicates(s: String): String {
    val stack = mutableListOf<Char>()

    for(char in s){
        if(stack.isNotEmpty() && stack.last() == char) stack.removeAt(stack.lastIndex)
        else stack.add(char)
    }
    return stack.joinToString("")
}