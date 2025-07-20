package leetcode

import patterns.singlelinkedlist.myapproach.Node


fun main() {
    val first = Node(10)
    val second = Node(20)
    val third = Node(30)
    first.next = second
    second.next = third
    val result = findPairsWithSum(first, 30)
    print(result)

}
fun findPairsWithSum(head: Node?, target: Int): List<Pair<Int, Int>> {
    val pairs = mutableListOf<Pair<Int, Int>>()

    // Pointers for the nested loop
    var leftPtr = head

    // Outer loop: Iterate the 'left' pointer
    while (leftPtr != null) {
        // Your described logic: right pointer starts at left's next
        var rightPtr = leftPtr.next

        // Inner loop: Iterate the 'right' pointer for each 'left'
        while (rightPtr != null) {
            // Check if the sum equals the target
            if (leftPtr.data + rightPtr.data == target) {
                pairs.add(Pair(leftPtr.data, rightPtr.data))
            }

            // Move the right pointer forward
            rightPtr = rightPtr.next
        }

        // Move the left pointer forward
        leftPtr = leftPtr.next
    }

    return pairs
}