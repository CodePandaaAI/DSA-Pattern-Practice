package patterns.doublelinkedlist

class Node(var data: Int) {
    var next: Node? = null
    var previous: Node? = null

}

class DLinkedList {
    private var head: Node? = null

    fun insertNode(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }

        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = newNode
        newNode.previous = current
    }

    fun deleteNode(data: Int) {
        if (head == null) return

        var current = head

        while (current?.next != null && current.next?.data != data) {
            current = current.next
        }
        if (current?.next == null) return

        current.next = current.next?.next
        current.next?.next?.previous = current
    }

    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data}-> ")
            current = current.next
        }
        print("null")
        println()
    }
}

fun main() {
    val list = DLinkedList()
    list.insertNode(20)
    list.insertNode(30)
    list.insertNode(40)
    list.printList()
    list.deleteNode(30)
    list.printList()
}