package patterns.stack.myapproach

fun main() {
    val postfixExpr = "a b c * + d -"
    val prefixExpr = postToPre(postfixExpr)
    println("Prefix: $prefixExpr")
}

fun postToPre(postfix: String?): String? {
    if (postfix == null) return null

    val stack = ArrayDeque<String>()
    val tokens = postfix.trim().split(" ")

    for (token in tokens) {
        if(!isOperatorr(token)){
            stack.addLast(token)
        }
        else {
            val op1 = stack.removeLast()
            val op2 = stack.removeLast()

            val exr = "$token$op2$op1"
            stack.addLast(exr)
        }
    }
    return stack.last()
}

fun isOperatorr(str: String): Boolean {
    return (str in listOf("+", "-", "/", "*"))
}