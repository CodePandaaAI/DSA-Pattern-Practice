package patterns.binarysearch.myapproach

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
        while (start <= end) {
            val mid = (start + end) / 2
            when {
                nums[mid] == target -> {
                    if (nums[mid + 1] == target) {
                        start = mid + 1
                    } else {
                        last = mid
                        break
                    }
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
            when (target) {
                nums[mid] -> {
                    if (nums[mid - 1] == target) {
                        end = mid - 1
                    } else {
                        first = mid
                        break
                    }
                }
            }
            if (nums[mid] < target) start = mid + 1
            else end = mid - 1
        }
    }
    val indexList = listOf(first, last)
    println(indexList)
}