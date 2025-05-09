package patterns.slidingwindow.myapproach

fun main() {
    // Max sum of subArray of size k
    val arr = listOf(2, 5, 8, 12, 14, 19, 25, 31, 40, 55, 100)
    val k = 3 // size of window
    val result = maxSumSubArray(arr, k)
    println(result)
}

fun maxSumSubArray(arr: List<Int>, k: Int): Int {
    var current = 0

    // Step 1: Calculate sum of first window
    for (i in 0..<k) {
        current += arr[i]
    }

    var maxSum = current

    // Step 2: Slide the window
    for (i in k..<arr.size) {
        current = current - arr[i - k] + arr[i]
        maxSum = maxOf(maxSum, current)
    }

    return maxSum
}

