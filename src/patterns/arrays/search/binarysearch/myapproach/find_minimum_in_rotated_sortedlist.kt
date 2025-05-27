package patterns.arrays.search.binarysearch.myapproach

fun main() {
    val nums = listOf(30, 40, 50, 60, 0, 5, 10, 15, 20)
    var start = 0
    var end = nums.lastIndex

    while (start < end) {
        val mid = (start + end) / 2
        if (nums[mid] > nums[end]) {
            // Minimum is in the right half (excluding mid)
            start = mid + 1
        } else {
            // Minimum is in the left half (including mid)
            end = mid
        }
    } // start == end -> index of minimum
    println(start)

}