package leetcode

fun main() {
    val result = search(intArrayOf(4,5,6,7,0,1,2), 0)
    print(result)
}

fun search(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.lastIndex

    while (start <= end) {
        val mid = start + (end - start) / 2

        if (nums[mid] == target) return mid

        if (nums[start] <= nums[mid]) {
            if (target < nums[mid] && target >= nums[start]) {
                end = mid - 1
            } else start = mid + 1
        } else {
            if (target > nums[mid] && target <= nums[end]) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
    }
    return -1
}