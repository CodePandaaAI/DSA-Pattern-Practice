package patterns.linearsearch.myapproach

fun main() {
    val nums = listOf<Int>(1, 2, 3, 4, 5, 6, 7)
    val target = 7
    val result = findTargetOcc(nums, target)

    when {
        result != -1 && result != -2 -> println("Found target ($target) at index $result")
        result == -2 -> println("Cant Check, List is empty")
        else -> println("Target not found")
    }

}

fun findTargetOcc(nums: List<Int>, target: Int): Int {
    var i = 0
    if (nums.isNotEmpty()) {
        while (i < nums.size) {
            if (nums[i] == target) {
                return i
            }
            i++
        }
    } else return -2

    return -1
}