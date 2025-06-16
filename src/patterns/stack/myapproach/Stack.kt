package patterns.stack.myapproach

class Stack<T> {
    private val elements = mutableListOf<T>()

    fun push(item: T) {
        elements.add(item)
        // println("Pushed: $item. Stack: $elements") // Keep for debugging if needed, but remove for production
    }

    fun pop(): T? {
        if (elements.isEmpty()) {
            // println("Can't Pop Stack is Empty") // Keep for debugging if needed
            return null
        }
        val poppedItem = elements.removeAt(elements.size - 1)
        // println("Popped: $poppedItem. Stack: $elements") // Keep for debugging if needed
        return poppedItem
    }

    // Renamed to 'peek' for convention
    fun peek(): T? {
        if (elements.isEmpty()) {
            // println("Stack is Empty, no element to peek.") // Keep for debugging if needed
            return null
        }
        val peekedElement = elements.last()
        // println("Peeked Element: $peekedElement. Stack: $elements") // Keep for debugging if needed
        return peekedElement
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

    // Renamed to 'size' (already was) and removed nullable Int
    fun size(): Int {
        return elements.size
    }

    // Optional: for debugging/representation, but consider returning a copy
    override fun toString(): String {
        return elements.toString()
    }
}

fun main() {
    val myIntStack = Stack<Int>()
    myIntStack.peek() // This will print "Stack is Empty..." if you keep the print inside
    myIntStack.push(25)
    myIntStack.push(45)
    myIntStack.push(55)
    println("Current Stack: ${myIntStack}") // Using toString()
    println("Stack Size: ${myIntStack.size()}")
    myIntStack.pop()
    println("Stack after pop: ${myIntStack}")
    println("Top element: ${myIntStack.peek()}")
    myIntStack.pop()
    myIntStack.pop()
    println("Stack empty? ${myIntStack.isEmpty()}")
    myIntStack.pop() // Try to pop from empty stack
}