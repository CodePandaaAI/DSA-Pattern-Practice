package patterns.singlelinkedlist.myapproach

fun main() {
    val first = Node(10)
    val second = Node(20)
    val third = Node(30)
    val aa = arrayOf(2,4,7,1,5,9)
    aa.sort()
    first.next = second
    second.next = third
    val target = 20
    val result = searchNode(first, target)
    print(result)
}

fun searchNode(head: Node, data: Int): Boolean {
    var current: Node? = head
    while (current != null) {
        if (current.data == data) return true
        else current = current.next
    }
    return false
}