package patterns.singlelinkedlist.myapproach


fun main() {
    val first = Node(10)
    val second = Node(20)
    val third = Node(30)
    first.next = second
    second.next = third

    val count = countNodes(first)
    println("Number of nodes: $count")
}

fun countNodes(head: Node?): Int {
    var current = head
    var count = 0

    while (current != null) {
        count++
        current = current.next
    }

    return count
}
