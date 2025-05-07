package patterns.search.binarysearch.myapproach

fun main() {
    val nums = listOf(
        1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 5, 7, 9, 11, 11, 11, 15
    )
    val target = 3
    var first = -1
    var last = -1

    var start = 0
    var end = nums.lastIndex
    while (start <= end) {
        val mid = (start + end) / 2
        if (nums[mid] == target) {
            first = mid
            end = mid - 1
        } else if (nums[mid] > target) {
            end = mid - 1
        } else start = mid + 1
    }
    start = 0
    end = nums.lastIndex
    while (start <= end) {
        val mid = (start + end) / 2
        if (nums[mid] == target) {
            last = mid
            start = mid + 1
        } else if (nums[mid] > target) {
            end = mid - 1
        } else start = mid + 1
    }

    val count = if (first == -1 || last == -1) 0 else last - first + 1
    println(count)
}