package patterns.singlelinkedlist

import patterns.singlelinkedlist.myapproach.Node

// Node class: each node holds data and reference to the next

// LinkedList class manages the chain
class LinkedList {
    var head: Node? = null

    // Insert at the end of the list
    fun insertAtEnd(data: Int) {
        val newNode = Node(data)

        // If the list is empty, new node becomes head
        if (head == null) {
            head = newNode
            return
        }

        // Traverse to the last node
        var current = head
        while (current?.next != null) {
            current = current.next
        }

        // Add new node at the end
        current?.next = newNode
    }

    // Print the linked list
    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} → ")
            current = current.next
        }
        println("null")
    }

    // Optional: Insert at the head
    fun insertAtHead(data: Int) {
        val newNode = Node(data)
        newNode.next = head
        head = newNode
    }
}

// Testing the LinkedList
fun main() {
    val list = LinkedList()

    list.insertAtEnd(10)
    list.insertAtEnd(20)
    list.insertAtEnd(30)
    list.printList()  // Output: 10 → 20 → 30 → null

    list.insertAtHead(5)
    list.printList()  // Output: 5 → 10 → 20 → 30 → null
}
