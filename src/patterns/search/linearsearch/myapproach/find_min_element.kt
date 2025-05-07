package patterns.search.binarysearch.linearsearch.myapproach

fun main() {
    val nums = listOf(8, 3, 5, 1, 6, 9)
    if (nums.isNotEmpty()) {
        val result = findMin(nums)
        println(result)
    } else println("Cant find list is empty")
}

fun findMin(nums: List<Int>): Int {
    var i = 0
    var minNo = Int.MAX_VALUE
    while(i<nums.size){
        if(nums[i]< minNo ){
            minNo = nums[i]
        }
        i++
    }
    return minNo
}