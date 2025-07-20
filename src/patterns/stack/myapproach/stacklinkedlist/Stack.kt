package patterns.stack.myapproach.stacklinkedlist

// Represents a single node in the linked list
// 'T' is a generic type, so our stack can hold any kind of data (Int, String, etc.)
data class Node<T>(
    val data: T,
    var next: Node<T>? = null
)

fun main() {
    val stack = Stack<Int>()

    stack.push(10)
    println(stack)
}

class Stack<T> {

    // The 'top' of the stack, which is the head of our linked list
    private var top: Node<T>? = null

    // Variable to keep track size of the stack
    var size: Int = 0
        private set // 'private set' means it can only be modified within this class

    /**
     * Pushes a new element onto the top of the stack.
     * This is a constant time operation, O(1).
     */
    fun push(item: T) {
        // 1. Create a new node with the item and set its 'next' to the current 'top'
        val newNode = Node(data = item, next = top)

        // 2. The new node becomes the new 'top' of the stack
        top = newNode

        // 3. Increment the size
        size++
    }

    /**
     * Removes and returns the element at the top of the stack.
     * Throws an exception if the stack is empty.
     * This is a constant time operation, O(1).
     */
    fun pop(): T {
        // Check if the stack is empty before trying to pop
        if (isEmpty()) {
            throw NoSuchElementException("Stack is empty")
        }

        // 1. Get a reference to the top node
        val poppedNode = top

        // 2. Move the 'top' reference to the next node in the list
        top = poppedNode?.next

        // 3. Decrement the size
        size--

        // 4. Return the data from the popped node
        return poppedNode!!.data
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * Throws an exception if the stack is empty.
     * This is a constant time operation, O(1).
     */
    fun peek(): T {
        if (isEmpty()) {
            throw NoSuchElementException("Stack is empty")
        }
        return top!!.data
    }

    /**
     * Checks if the stack is empty.
     */
    fun isEmpty(): Boolean {
        return top == null
    }

    /**
     * Optional: Returns a string representation of the stack for easy printing.
     */
    override fun toString(): String {
        if (isEmpty()) {
            return "Stack is empty"
        }
        val builder = StringBuilder()
        var current = top
        while (current != null) {
            builder.append(current.data)
            if (current.next != null) {
                builder.append(" -> ")
            }
            current = current.next
        }
        return builder.toString()
    }
}