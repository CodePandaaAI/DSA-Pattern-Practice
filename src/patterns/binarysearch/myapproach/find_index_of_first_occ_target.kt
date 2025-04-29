package patterns.binarysearch.myapproach

fun main() {
    val nums =
        listOf(1, 3, 3, 3, 5, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 15, 18, 20, 25, 26, 90, 120)
    val target = 11
    if (target <= nums[nums.lastIndex] && target >= nums.first()) {
        var start = 0
        var end = nums.lastIndex

        while (start <= end) {
            val mid = (start + end) / 2
            if (nums[mid] == target && nums[mid - 1] != target) {
                println("Target lies at index $mid")
                break
            } else if (nums[mid - 1] == target) end = mid - 1
            else if (nums[mid] > target) end = mid - 1
            else if (nums[mid] < target) start = mid + 1
            else println("Unexpected error")
        }
    } else println("Cant run as target is out of scope of the list numbers present")
}
