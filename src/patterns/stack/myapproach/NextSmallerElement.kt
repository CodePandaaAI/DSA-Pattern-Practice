package patterns.stack.myapproach

import java.util.Stack

fun nextSmallerElements(arr: IntArray?): IntArray? {
    if (arr == null || arr.isEmpty()) {
        return intArrayOf()
    }

    val n = arr.size
    val result = IntArray(n)
    val stack = Stack<Int>()

    for (i in n - 1 downTo 0) {
        val currentElement = arr[i]

        while (stack.isNotEmpty() && stack.peek() >= currentElement) {
            stack.pop()
        }

        if (stack.isEmpty()) {
            result[i] = -1
        } else {
            result[i] = stack.peek()
        }

        stack.push(currentElement)
    }

    return result
}

fun main() {
    val arr1 = intArrayOf(4, 8, 5, 2, 25)
    val result1 = nextSmallerElements(arr1)
    println("Input: ${arr1.contentToString()}")
    println("Output: ${result1?.contentToString()}")

    val arr2 = intArrayOf(10, 9, 8, 7)
    val result2 = nextSmallerElements(arr2)
    println("Input: ${arr2.contentToString()}")
    println("Output: ${result2?.contentToString()}")

    val arr3 = intArrayOf(1, 2, 3, 4)
    val result3 = nextSmallerElements(arr3)
    println("Input: ${arr3.contentToString()}")
    println("Output: ${result3?.contentToString()}")

    val arr4 = intArrayOf(4, 3, 2, 1)
    val result4 = nextSmallerElements(arr4)
    println("Input: ${arr4.contentToString()}")
    println("Output: ${result4?.contentToString()}")

    val arr5 = intArrayOf()
    val result5 = nextSmallerElements(arr5)
    println("Input: ${arr5.contentToString()}")
    println("Output: ${result5?.contentToString()}")
}