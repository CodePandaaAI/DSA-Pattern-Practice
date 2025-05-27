package patterns.arrays.search.binarysearch.onlinesolution

fun main() {
    val nums = listOf(1, 3, 5, 6, 10, 14, 66, 68)
    val target = 67
    var start = 0
    var end = nums.lastIndex

    while (start <= end) {
        val mid = (start + end) / 2
        when {
            nums[mid] == target -> {
                println("Found at index $mid")
                return
            }
            nums[mid] < target -> start = mid + 1
            else -> end = mid - 1
        }
    }
    println("Target not found, can be inserted at index $start")
}