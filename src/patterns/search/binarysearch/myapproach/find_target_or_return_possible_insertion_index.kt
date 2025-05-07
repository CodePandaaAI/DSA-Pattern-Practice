package patterns.search.binarysearch.myapproach

fun main() {
    val nums = listOf(1, 3, 5, 6, 10, 14, 66, 68)
    var start = 0
    var end = nums.lastIndex
    val target = 67
    if (target > nums.last()) {
        println("Target can be inserted at index ${nums.lastIndex + 1}")
    } else if (target < nums[0]) {
        println("Target can be inserted at index 0")
    } else {
        while (start <= end) {
            val mid = (start + end) / 2
            if (nums[mid] == target) {
                println("Found target at index $mid")
                break
            } else if (nums[mid] > target) {
                end = mid - 1
                if (nums[mid - 1] < target) {
                    println("Target doesn't exists, Can insert at index $mid")
                    break
                }
            } else if (nums[mid] < target) {
                start = mid + 1
                if (nums[mid + 1] > target) {
                    println("Target doesn't exists, Can insert at index ${mid + 1}")
                    break
                }
            } else println("Unexpected")
        }
    }
}