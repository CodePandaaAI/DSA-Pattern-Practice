package patterns.arrays.search.binarysearch.onlinesolution

fun main() {
    val nums = listOf(1, 3, 3, 3, 5, 7, 7, 9, 11, 11, 11, 15)
    val target = 11

    var start = 0
    var end = nums.lastIndex
    var result = -1

    while (start <= end) {
        val mid = (start + end) / 2
        when {
            nums[mid] == target -> {
                result = mid // Store the result
                start = mid + 1 // But keep looking to the right
            }
            nums[mid] < target -> {
                start = mid + 1
            }
            else -> {
                end = mid - 1
            }
        }
    }

    println("Last occurrence of $target is at index: $result")
}