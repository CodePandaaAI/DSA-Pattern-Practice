package patterns.stack.myapproach

fun main() {
    val result = isValid("()")
    print(result)
}

fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()
    val bracketMap = mapOf(
        '(' to ')',
        '{' to '}',
        '[' to ']'
    )

    for (char in s) {
        if (bracketMap.containsKey(char)) {
            stack.add(bracketMap.getValue(char))
        } else {
            if (stack.isEmpty()) {
                return false
            }
            val topElement = stack.removeAt(stack.lastIndex)
            if (topElement != char) {
                return false
            }
        }
    }
    return stack.isEmpty()
}