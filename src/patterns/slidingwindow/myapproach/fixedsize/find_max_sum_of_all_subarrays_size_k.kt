package patterns.slidingwindow.myapproach.fixedsize

fun main() {
    val arr = listOf(4, 2, 1, 7, 8, 1, 2, 8, 1, 0)
    val k = 3
    var current = 0

    for (i in 0..<k) {
        current += arr[i]
    }

    var maxSum = current

    for (i in k..arr.lastIndex) {

        current = current - arr[i - k] + arr[i]

        if (current > maxSum) {
            maxSum = current
        }
    }
    println(maxSum)
}