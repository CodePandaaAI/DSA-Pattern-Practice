package patterns.binarysearch.myapproach

fun main() {
    val nums = listOf(30, 40, 50, 60, 5, 10, 20)
    val target = 10
    var start = 0
    var end = nums.lastIndex

    while (start <= end) {
        val mid = (start + end) / 2
        if (nums[mid] == target) {
            println("Target found at index $mid")
            return
        }

        // Left half sorted?
        if (nums[start] <= nums[mid]) {
            // Target in this left half?
            if (target >= nums[start] && target < nums[mid]) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        // Right half sorted
        else {
            if (target > nums[mid] && target <= nums[end]) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
    }

    println("Target not found")
}
