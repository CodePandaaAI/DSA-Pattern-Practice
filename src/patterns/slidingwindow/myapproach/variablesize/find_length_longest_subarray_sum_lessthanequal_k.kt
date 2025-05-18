package patterns.slidingwindow.myapproach.variablesize

fun main() {
    val arr = listOf(1, 2, 1, 0, 1, 1, 0)
    val k = 4
    var windowStart = 0
    var windowSum = 0
    var maxLength = 0

    for (windowEnd in arr.indices) {
        windowSum += arr[windowEnd]

        // Shrink window while sum > k
        while (windowSum > k) {
            windowSum -= arr[windowStart]
            windowStart++
        }

        // Valid subarray
        val windowLength = windowEnd - windowStart + 1
        maxLength = maxOf(maxLength, windowLength)
    }

    println("Longest subarray length with sum ≤ $k: $maxLength")
}
