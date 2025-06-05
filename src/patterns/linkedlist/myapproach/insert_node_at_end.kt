package patterns.linkedlist.myapproach

fun main() {
    val first = Node(1)
    val second = Node(2)
    val third = Node(3)

    first.next = second
    second.next = third

    insertAtEnd(4, first)
    var current: Node? = first
    while(current != null){
        print("${current.data}-> ")
        current = current.next
    }
    print("null")
}

fun insertAtEnd(data: Int, head: Node?) {
    var current = head
    val newNode = Node(data)

    while(current?.next != null){
        current = current.next
    }

    current?.next = newNode
    newNode.next = null
}