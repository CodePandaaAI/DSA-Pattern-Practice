package patterns.binarysearch.myapproach

fun main() {
    val nums = listOf(99, 87, 75, 63, 52, 41, 30, 21, 10, 1)
    val target = 1
    var start = 0
    var end = nums.lastIndex

    while (start <= end) {
        val mid = (start + end) / 2
        if (nums[mid] == target) {
            println("target found at index $mid")
            break
        } else if (nums[mid] > target) {
            start = mid + 1
        } else end = mid - 1
    }
}