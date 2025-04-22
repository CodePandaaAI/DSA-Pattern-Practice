package patterns.binarysearch.myapproach

fun main() {
    val nums = listOf(1, 3, 3, 3, 5, 7, 7, 9, 11, 11, 11, 15)
    val target = 11

    var start = 0
    var end = nums.lastIndex
    var targetLastIndex = 0

    val mid = (start + end) / 2
    when {
        nums[mid] > target -> {
            end = mid - 1
        }

        nums[mid] < target -> {
            start = mid + 1
        }

        else -> {
            println("unexpected")
        }
    }
    while(start<=end){
        if (nums[start] == target) targetLastIndex = start
        start++
    }
    println(targetLastIndex)
}