package leetcode

fun main() {
    val nums = intArrayOf(1, 3, 2)
    nextPermutation(nums)
    print(nums.toList())
}

fun nextPermutation(nums: IntArray) {
    var breakPoint = -1
    for (i in nums.size - 2 downTo 0) {
        if (nums[i] < nums[i + 1]) {
            breakPoint = i
            for (j in nums.size - 1 downTo 0) {
                if (nums[j] > nums[i]) {
                    nums[i] = nums[j].also { nums[j] = nums[i] }
                    break
                }
            }
            break
        }
    }
    var start = breakPoint + 1
    var end = nums.size - 1
    while (start < end) {
        nums[start] = nums[end].also { nums[end] = nums[start] }
        start++
        end--
    }
}