package patterns.search.binarysearch.onlinesolution

fun main() {
    val nums = listOf(5, 7, 7, 8, 8, 8)
    val target = 8

    fun findFirst(): Int {
        var start = 0
        var end = nums.lastIndex
        var first = -1
        while (start <= end) {
            val mid = (start + end) / 2
            if (nums[mid] == target) {
                first = mid
                end = mid - 1 // go left
            } else if (nums[mid] < target) {
                start = mid + 1
            } else end = mid - 1
        }
        return first
    }

    fun findLast(): Int {
        var start = 0
        var end = nums.lastIndex
        var last = -1
        while (start <= end) {
            val mid = (start + end) / 2
            if (nums[mid] == target) {
                last = mid
                start = mid + 1 // go right
            } else if (nums[mid] < target) {
                start = mid + 1
            } else end = mid - 1
        }
        return last
    }

    println(listOf(findFirst(), findLast()))
}