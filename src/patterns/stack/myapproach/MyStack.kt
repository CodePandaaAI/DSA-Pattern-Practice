package patterns.stack.myapproach
class MyStack {
    // Create a queue using ArrayList logic
    private val queue = ArrayList<Int>()

    // Push element onto stack
    fun push(x: Int) {
        queue.add(x) // Add to end like a queue  [8, 7] size = 1 .. 0..1 -> [7] temp = 8 -> [7, 8]

        // Rotate the queue to bring new element to front
        var i = 0
        while (i < queue.size - 1) {
            val temp = queue.removeAt(0) // Remove front
            queue.add(temp)              // Add it to the end
            i++
        }
    }

    // Pop element from top of stack
    fun pop(): Int {
        return queue.removeAt(0) // Front is treated as top of stack -> 8
    }

    // Get top element
    fun top(): Int {
        return queue[0]
    }

    // Check if stack is empty
    fun empty(): Boolean {
        return queue.isEmpty()
    }
}

fun main() {
    val stack = MyStack()

    println("Pushing 10")
    stack.push(10)
    println("Top: ${stack.top()}") // Should print 10

    println("Pushing 20")
    stack.push(20)
    println("Top: ${stack.top()}") // Should print 20

    println("Pushing 30")
    stack.push(30)
    println("Top: ${stack.top()}") // Should print 30

    println("Popping: ${stack.pop()}") // Should remove 30
    println("Top after pop: ${stack.top()}") // Should now be 20

    println("Popping: ${stack.pop()}") // Should remove 20
    println("Is stack empty? ${stack.empty()}") // false

    println("Popping: ${stack.pop()}") // Should remove 10
    println("Is stack empty now? ${stack.empty()}") // true
}
