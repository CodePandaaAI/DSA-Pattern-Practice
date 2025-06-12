package leetcode

fun main() {
    val result = findKthPositive(intArrayOf(2,3,4,7,11), 5)
    print(result)
}
fun findKthPositive(arr: IntArray, k: Int): Int {
        var missingCount = 0
        var currentNumber = 1
        var arrIndex = 0

        while (missingCount < k) {
            if (arrIndex < arr.size && arr[arrIndex] == currentNumber) {
                arrIndex++
            } else {
                missingCount++
            }

            if (missingCount == k) {
                return currentNumber
            }

            currentNumber++
        }
        return -1
}