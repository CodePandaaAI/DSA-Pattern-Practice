package patterns.binarysearch.myapproach

fun main() {
    val nums = listOf(1, 2, 3, 3, 3, 5, 7, 7, 9, 11, 11, 11, 11, 15)
    val target = 3

    var start = 0
    var end = nums.lastIndex

    while (start <= end) {
        val mid = (start + end) / 2
        if (mid > 0 && nums[mid] == target && nums[mid - 1] != target) {
            println("target found at index $mid")
            break
        } else if (mid > 0 && nums[mid - 1] == target) {
            end = mid - 1
        } else if (nums[mid] > target) {
            end = mid - 1
        } else if (nums[mid] < target) {
            start = mid + 1
        } else println("Unexpected")
    }
}