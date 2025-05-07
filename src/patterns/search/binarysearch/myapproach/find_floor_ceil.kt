package patterns.search.binarysearch.myapproach

fun main() {
    val nums = listOf(2, 3, 5, 7, 11)
    var start = 0
    var end = nums.lastIndex
    var floor: Int? = null
    var ceil: Int? = null
    val target = 9

    while (start <= end) {
        val mid = (start + end) / 2
        if(nums[mid] == target){
            floor = nums[mid]
            ceil = nums[mid]
            break
        }
        if (nums[mid] > target) {
            ceil = nums[mid]
            end = mid - 1
        }
        if (nums[mid] < target) {
            floor = nums[mid]
            start = mid + 1
        }
    }
    println("floor $floor ceil $ceil")
}