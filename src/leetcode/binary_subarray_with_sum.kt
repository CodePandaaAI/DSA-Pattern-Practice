package leetcode


fun main() {
    val nums = intArrayOf(1, 0, 1, 0, 1)
    val goal = 2

    val result = numSubarraysWithSum(nums, goal)
    print(result)
}

fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
    val map = mutableMapOf<Int, Int>()
    map[0] = 1

    var prefixSum = 0
    var count = 0

    for (num in nums) {
        prefixSum += num

        // Check if there exists a previous prefix sum such that
        // prefixSum - previous = goal → previous = prefixSum - goal
        count += map.getOrDefault(prefixSum - goal, 0)

        // Store current prefixSum in map
        map[prefixSum] = map.getOrDefault(prefixSum, 0) + 1
    }

    return count
}