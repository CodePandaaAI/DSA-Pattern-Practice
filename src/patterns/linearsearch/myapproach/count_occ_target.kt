package patterns.linearsearch.myapproach

fun main() {
    val nums = listOf<Int>(1, 3, 3, 5, 3, 7, 9)
    val target = 3
    val result = countOccTarget(nums, target)

    when {
        result != -1 && result != -2 -> println("The target $target occurs $result times in the list")
        result == -1 -> println("Target not found")
        else -> println("Cant check list is empty")
    }
}

private fun countOccTarget(nums: List<Int>, target: Int): Int {

    if (nums.isNotEmpty()) {
        var i = 0
        var targetOccurance = 0
        while (i < nums.size) {
            if (nums[i] == target) targetOccurance++
            i++
        }
        return if (targetOccurance > 0) {
            targetOccurance
        } else return -1
    } else return -2
}