package patterns.stack.myapproach

fun infixToPrefix(expression: String): String {
    fun precedence(ch: Char): Int {
        return when (ch) {
            '+', '-' -> 1
            '*', '/' -> 2
            else -> -1
        }
    }

    fun isOperand(ch: Char): Boolean {
        return ch in 'a'..'z'
    }

    fun infixToPostfix(expr: String): String {
        val result = StringBuilder()
        val stack = ArrayDeque<Char>()

        for (ch in expr) {
            when {
                isOperand(ch) -> result.append(ch)
                ch == '(' -> stack.addLast(ch)
                ch == ')' -> {
                    while (stack.isNotEmpty() && stack.last() != '(') {
                        result.append(stack.removeLast())
                    }
                    if (stack.isNotEmpty() && stack.last() == '(') {
                        stack.removeLast()
                    }
                }
                else -> { // operator
                    while (stack.isNotEmpty() && precedence(stack.last()) >= precedence(ch)) {
                        result.append(stack.removeLast())
                    }
                    stack.addLast(ch)
                }
            }
        }

        while (stack.isNotEmpty()) {
            result.append(stack.removeLast())
        }

        return result.toString()
    }

    // Step 1 & 2: Reverse + swap brackets
    val reversed = expression.reversed().map {
        when (it) {
            '(' -> ')'
            ')' -> '('
            else -> it
        }
    }.joinToString("")

    val postfix = infixToPostfix(reversed)
    
    return postfix.reversed()
}

fun main() {
    println(infixToPrefix("(a+b)*c"))
    println(infixToPrefix("a+b*c"))
    println(infixToPrefix("a*b+c"))
    println(infixToPrefix("a+b*(c^d-e)^(f+g*h)-i"))
}