package patterns.slidingwindow.myapproach.variablesize

fun countSubarraysWithSum(nums: IntArray, k: Int): Int {
    var start = 0
    var sum = 0
    var count = 0

    for (end in nums.indices) {
        sum += nums[end]

        // shrink if sum > k
        while (sum > k && start <= end) {
            sum -= nums[start]
            start++
        }

        if (sum == k) {
            count++
        }
    }

    return count
}

fun main() {
    val nums = intArrayOf(1, 2, 1, 3)
    val k = 3
    val result = countSubarraysWithSum(nums, k)
    println("Count of subarrays with sum exactly $k: $result")
}
