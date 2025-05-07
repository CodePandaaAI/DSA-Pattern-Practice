package patterns.search.binarysearch.myapproach

fun main() {
    val nums = listOf(1, 2, 1, 3, 5, 6, 4)
    var start = 0
    var end = nums.lastIndex

    while (start < end) {
        val mid = (start + end) / 2
        if (nums[mid] < nums[mid + 1]) {
            // peak lies on the right side
            start = mid + 1
        } else {
            // peak lies on the left side (could be mid too)
            end = mid
        }
    }

    println("Peak at index $start with value ${nums[start]}")
}
