package leetcode

import java.util.EmptyStackException

class ArrayStack(private val capacity: Int) {
    private val stackArray: IntArray = IntArray(capacity)

    private var top: Int = -1

    fun push(x: Int) {
        if (isFull()) {
            println("Stack Overflow! Cannot push element.")
            return
        }
        stackArray[++top] = x
    }

    fun pop(): Int {
        if (isEmpty()) {
            throw EmptyStackException()
        }
        return stackArray[top--]
    }

    fun top(): Int {
        if (isEmpty()) {
            throw EmptyStackException()
        }
        return stackArray[top]
    }

    fun isEmpty(): Boolean {
        return top == -1
    }

    private fun isFull(): Boolean {
        return top == capacity - 1
    }
}

fun main() {
    val stack = ArrayStack(5)

    stack.push(10)
    stack.push(20)
    println(stack.top()) // Should print 20
    stack.push(30)
    stack.push(40)
    stack.push(50)

    // This push will result in a "Stack Overflow!" message.
    stack.push(60)

    println(stack.isEmpty())

    stack.pop() // Popping 50
    stack.pop() // Popping 40

    println(stack.top()) // Should print 30
}
