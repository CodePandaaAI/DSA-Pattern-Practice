package patterns.arrays.search.binarysearch.linearsearch.myapproach

fun main() {
    val nums = listOf(1, 3, 3, 5, 3, 7, 9)
    val target = readln().toInt()
    val result = countOccTarget(nums, target)

    when {
        result.isNotEmpty() -> println("Target ($target) all occurance indexes are $result")
        else -> println("Cant check list is empty or Target doesn't exists")
    }
}

private fun countOccTarget(nums: List<Int>, target: Int): List<Int> {

    if (nums.isNotEmpty()) {
        var i = 0
        val targetOccList = mutableListOf<Int>()
        while (i < nums.size) {
            if (nums[i] == target) targetOccList.add(i)
            i++
        }
        return targetOccList
    } else return emptyList()
}