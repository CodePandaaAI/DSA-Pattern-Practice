# My Kotlin Stack Implementation

This repository contains a simple, generic **Stack** data structure implemented in Kotlin. A Stack is a fundamental data structure that follows the **Last-In, First-Out (LIFO)** principle.

## Features

* **Generic Type `T`**: Can store elements of any data type (e.g., `Int`, `String`, custom objects).
* **Core Stack Operations**:
    * `push(item: T)`: Adds an element to the top of the stack.
    * `pop(): T?`: Removes and returns the element from the top of the stack. Returns `null` if the stack is empty.
    * `peak(): T?`: Returns the top element without removing it. Returns `null` if the stack is empty.
    * `size(): Int?`: Returns the number of elements in the stack.
    * `getStack(): List<T?>`: Returns a list representation of the stack's elements (useful for debugging/display, but typically not a standard stack operation).

## How it Works

The `Stack` class internally uses a `MutableList` to store its elements. The "top" of the stack is always considered the last element added to the `MutableList`.

* `push`: Uses `MutableList.add()` to append elements.
* `pop`: Uses `MutableList.removeAt(lastIndex)` to remove the last element.
* `peak`: Uses `MutableList.last()` to access the last element.

## Usage Example

```kotlin
fun main() {
    val myIntStack = Stack<Int>()

    // Try to peek an empty stack
    myIntStack.peak() // Output: Can't Peak Stack is Empty

    // Push elements
    myIntStack.push(25) // Output: Pushed: 25. Stack: [25]
    myIntStack.push(45) // Output: Pushed: 45. Stack: [25, 45]
    myIntStack.push(55) // Output: Pushed: 55. Stack: [25, 45, 55]

    // Get all elements (for demonstration)
    val elements = myIntStack.getStack()
    println(elements) // Output: [25, 45, 55]

    // Check size
    print(myIntStack.size()) // Output: 3

    // Pop an element
    myIntStack.pop() // Output: Popped: 55. Stack: [25, 45]

    // Display remaining elements
    println(elements) // Output: [25, 45] (Note: 'elements' still references the internal list, so it updates)
}