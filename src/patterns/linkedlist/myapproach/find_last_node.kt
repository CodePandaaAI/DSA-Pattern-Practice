package patterns.linkedlist.myapproach

fun main() {
    val first = Node(10)
    val second = Node(20)
    val third = Node(30)

    first.next = second
    second.next = third

    val result = findLast(first)
    print(result)
}

fun findLast(head: Node?): Int {
    var current: Node? = head

    while(current?.next != null) {
        current = current.next
    }
    return current?.data ?: -1
}