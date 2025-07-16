package leetcode

import patterns.singlelinkedlist.LinkedList
import patterns.singlelinkedlist.myapproach.Node
fun main() {
    val list = LinkedList()

    val result = deleteMiddle(list.head)
    list.printList()

}
fun deleteMiddle(head: Node?): Node? {
    var slow: Node? = head
    var fast: Node? = head
    var prev: Node? = null

    while (fast != null && fast.next != null) {
        prev = slow
        slow = slow?.next
        fast = fast.next?.next
    }
    prev?.next = slow?.next

    return head
}