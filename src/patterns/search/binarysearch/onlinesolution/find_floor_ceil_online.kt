package patterns.search.binarysearch.onlinesolution

fun main() {
    val nums = listOf(2, 3, 5, 7, 11)
    val target = 12
    var start = 0
    var end = nums.lastIndex
    var floor: Int? = null
    var ceil: Int? = null

    while (start <= end) {
        val mid = (start + end) / 2
        when {
            nums[mid] == target -> {
                floor = nums[mid]
                ceil = nums[mid]
                break
            }
            nums[mid] < target -> {
                floor = nums[mid] // mid might be floor
                start = mid + 1
            }
            else -> {
                ceil = nums[mid] // mid might be ceil
                end = mid - 1
            }
        }
    }

    println("Floor = $floor")
    println("Ceil = $ceil")
}
