package patterns.arrays.slidingwindow.myapproach.variablesize

fun main() {
    val arr = listOf(2, 1, 5, 2, 3, 2)
    val target = 7
    val result = minSubArrayLen(target, arr)
    println("Smallest length = $result")
}

fun minSubArrayLen(target: Int, arr: List<Int>): Int {
    var start = 0
    var sum = 0
    var minLength = Int.MAX_VALUE

    for (end in arr.indices) {
        sum += arr[end]

        while (sum >= target) {
            minLength = minOf(minLength, end - start + 1)
            sum -= arr[start]
            start++
        }
    }

    return if (minLength == Int.MAX_VALUE) 0 else minLength
}
