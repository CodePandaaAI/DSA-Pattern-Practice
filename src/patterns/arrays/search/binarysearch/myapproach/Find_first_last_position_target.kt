package patterns.arrays.search.binarysearch.myapproach

fun main() {
    val nums = listOf(5, 7, 7, 8, 9, 10, 11, 12, 13)
    var start = 0
    var end = nums.lastIndex
    val target = 8
    var first = -1
    var last = -1

    // Find Last Position
    if (nums.last() == target) {
        last = nums.lastIndex
    } else {
        // Find Last Index
        while (start <= end) {
            val mid = (start + end) / 2
            when {
                nums[mid] == target -> {
                    last = mid
                    start = mid + 1
                }
                nums[mid] > target -> {
                    end = mid - 1
                }
                else -> start = mid + 1
            }
        }
    }
    // Find First Position
    if (nums[0] == target) {
        first = 0
    } else {
        start = 0
        end = nums.lastIndex
        while (start <= end) {
            val mid = (start + end) / 2
            when {
                nums[mid] == target -> {
                    first = mid
                    end = mid - 1
                }
                nums[mid] > target -> {
                    end = mid - 1
                }
                else -> start = mid + 1
            }
        }
    }
    println(listOf(first, last))
}