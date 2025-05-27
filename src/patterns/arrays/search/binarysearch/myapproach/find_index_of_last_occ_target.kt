package patterns.arrays.search.binarysearch.myapproach

fun main() {
    val nums = listOf(1, 2, 3, 3, 3, 5, 7, 7, 9, 11, 11, 11, 11, 15)
    val target = 3

    var start = 0
    var end = nums.lastIndex
    var result = -1

    while (start <= end) {
        val mid = start + (end - start) / 2
        when {
            nums[mid] == target -> {
                result = mid // store index and keep going right
                start = mid + 1
            }
            nums[mid] < target -> start = mid + 1
            else -> end = mid - 1
        }
    }

    if (result != -1) {
        println("Last occurrence of $target found at index $result")
    } else {
        println("$target not found")
    }
}
