package patterns.singlelinkedlist.myapproach

fun reverseList(head: Node?): Node? {
    if (head?.next == null) {
        return head
    }

    var prev: Node? = null
    var current = head

    while (current != null) {
        val nextTemp = current.next
        current.next = prev
        prev = current
        current = nextTemp
    }

    return prev
}

fun main() {
    val head = Node(1)
    head.next = Node(2)
    head.next?.next = Node(3)
    head.next?.next?.next = Node(4)

    println("Original list:")
    printList(head)

    val reversedHead = reverseList(head)

    println("Reversed list:")
    printList(reversedHead)
}

fun printList(head: Node?) {
    var current = head
    while (current != null) {
        print("${current.data}")
        if (current.next != null) {
            print(" -> ")
        }
        current = current.next
    }
    println(" -> null")
}