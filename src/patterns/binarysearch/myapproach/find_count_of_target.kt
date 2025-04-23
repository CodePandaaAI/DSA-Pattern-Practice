package patterns.binarysearch.myapproach

fun main() {
    val nums = listOf(1, 3, 3, 3, 5, 7, 7, 9, 11, 11, 11, 15)
    val target = 3
    var start = 0
    var end = nums.lastIndex
    var targetFoundTimes = 0
    var targetFoundLeft = 0
    var targetFoundRight = 0

    while (start <= end) {
        val mid = (start + end) / 2
        if (nums[mid] == target) {
            targetFoundTimes = mid
            break
        } else if (nums[mid] > target) {
            end = mid - 1
        } else start = mid + 1
    }
    println(targetFoundTimes)
}