package patterns.binarysearch.myapproach

fun main() {
    val nums = listOf(2, 4, 7, 10, 13, 18)
    val target = 2
    if (target <= nums[nums.lastIndex] && target >= nums.first()) {
        var start = 0
        var end = nums.lastIndex

        while (start <= end) {
            val mid = (start + end) / 2
            if (nums[mid] == target) {
                println("Target lies at index $mid")
                break
            } else if (nums[mid] > target) end = mid - 1
            else if (nums[mid] < target) start = mid + 1
            else println("Unexpected error")
        }
    } else println("Cant run as target is out of scope of the list numbers present")
}