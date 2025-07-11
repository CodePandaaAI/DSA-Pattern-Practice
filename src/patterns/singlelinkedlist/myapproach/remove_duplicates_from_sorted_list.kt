package patterns.singlelinkedlist.myapproach

fun main() {
    val f = Node(1)
    val s = Node(2)
    val th = Node(3)
    val fo = Node(3)
    val fi = Node(4)
    f.next = s
    s.next = th
    th.next = fo
    fo.next = fi

    deleteDuplicates(f)
    var current: Node? = f
    while(current != null){
        print("${current.data}-> ")
        current = current.next
    }
    print("null")
}

fun deleteDuplicates(head: Node?): Node? {
    val dummy = Node(-1)
    var current: Node? = head
    dummy.next = current

    while(current?.next != null) {
        val next = current.next
        if(current.next?.data == current.data) current.next = next?.next
        else {
            current = current.next
        }
    }

    return dummy.next
}