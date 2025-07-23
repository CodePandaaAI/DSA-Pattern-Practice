package patterns.stack.myapproach

fun isOperator(ch: String): Boolean {
    return ch in listOf("+", "-", "*", "/")
}

fun prefixToInfix(prefix: String): String { // prefix = "+ * A B - C D" -> []
    val stack = ArrayDeque<String>()
    val tokens = prefix.trim().split(" ").asReversed()

    for (token in tokens) {
        if (!isOperator(token)) {
            stack.addFirst(token)
        } else {
            val op1 = stack.removeFirst()  //
            val op2 = stack.removeFirst()
            val expr = "($op1 $token $op2)"
            stack.addFirst(expr)
        }
    }

    return stack.first()
}

fun main() {
    val prefixExpr = "+ * A B - CD "
    val infixExpr = prefixToInfix(prefixExpr)
    println("Infix: $infixExpr")
}
