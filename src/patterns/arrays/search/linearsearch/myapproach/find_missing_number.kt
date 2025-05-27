package patterns.arrays.search.binarysearch.linearsearch.myapproach

fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6)
    val result = findMissingNo(nums)
    if(result!= 0)
    println(result)
    else println("The sequence is perfect")
}

fun findMissingNo(nums: List<Int>): Int {
    var i = 0
    while (i < nums.size && i!= nums.lastIndex) {
        if (nums[i] + 1 != nums[i + 1]) {
            return nums[i] + 1
        }
        i++
    }
    return 0
}