package patterns.linearsearch.myapproach

fun main() {
    val nums = listOf(10, 20, 30, 40, 50)
    val target = readln().toInt()

    val result = checkTargetExists(nums, target)

    when {
        result != -1 && result != -2 -> println("Found target $target at index $result")
        result == -1 -> println("Target not found")
        else -> println("Cant check list is empty")
    }
}

private fun checkTargetExists(nums: List<Int>, target: Int): Int {
    var i = 0
    when {
        nums.isNotEmpty() -> {
            while (i < nums.size) {
                if (nums[i] == target) return i
                i++
            }
        }

        else -> return -2
    }

    return -1
}