package patterns.search.binarysearch.myapproach

fun main() {
    val nums = listOf(1, 3, 3, 3, 11, 11, 11, 11, 11, 11, 11, 11, 15, 18, 20, 25, 26, 90, 120)
    val target = 11
    var result = -1
    var start = 0
    var end = nums.lastIndex

    while (start <= end) {
        val mid = (start + end) / 2
        when {
            nums[mid] == target -> {
                result = mid
                end = mid - 1
            }

            nums[mid] < target -> start = mid + 1
            else -> end = mid - 1
        }
    }
    if(result != -1){
        println("target found at index $result")
    }
}
