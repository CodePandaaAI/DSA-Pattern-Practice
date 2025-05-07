package patterns.search.binarysearch.linearsearch.myapproach

fun main() {
    val nums = listOf<Int>()
    val target = 3
    val result = lastOccTarget(nums, target)
    when {
        result != -1 && result != -2 -> println("Target ($target)Last Occ Index is $result")
        result == -1 -> println("Target not found")
        else -> println("Can't Check List is Empty")
    }
}

fun lastOccTarget(nums: List<Int>, target: Int): Int {
    var lastFoundIndexOfTarget = 0
    var i = 0
    if (nums.isNotEmpty()) {
        while (i < nums.size) {
            if (nums[i] == target) {
                lastFoundIndexOfTarget = i
            }
            i++
        }
    } else return -2
    return if (nums[lastFoundIndexOfTarget] == target) {
        lastFoundIndexOfTarget
    } else -1
}