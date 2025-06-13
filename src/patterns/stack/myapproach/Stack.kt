package patterns.stack.myapproach

class Stack<T> {
    private val elements = mutableListOf<T>()

    fun push(item: T) {
        elements.add(item)
        println("Pushed: $item. Stack: $elements")
    }

    fun pop(): T? {
        if(elements.isEmpty()){
            println("Can't Pop Stack is Empty")
            return null
        }
        val poppedItem = elements.removeAt(elements.size - 1)
        println("Popped: $poppedItem. Stack: $elements")
        return poppedItem
    }

    fun peak(): T? {
        if(elements.isEmpty()){
            println("Can't Peak Stack is Empty")
            return null
        }
        val peakedElement = elements.last()
        println("Peaked Element: $peakedElement. Stack: $elements (No Item )")
        return peakedElement
    }

    fun getStack(): List<T?> {
        if(elements.isEmpty()){
            println("Can't Peak Stack is Empty")
            return emptyList()
        }
        return elements
    }

    fun size(): Int? {
        return elements.size
    }
}

fun main() {
    val myIntStack = Stack<Int>()
    myIntStack.peak()
    myIntStack.push(25)
    myIntStack.push(45)
    myIntStack.push(55)
    val elements = myIntStack.getStack()
    println(elements)
    print(myIntStack.size())
    myIntStack.pop()
    println(elements)
}