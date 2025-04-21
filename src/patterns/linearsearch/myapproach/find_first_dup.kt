package patterns.linearsearch.myapproach

fun main() {
    val nums = listOf(5, 3, 1, 2, 3, 6)
    if (nums.isNotEmpty()){
        val result = findDuplicate(nums)
        if (result!= -1) println(result)
        else println("No duplicate elements found")
    }
    else println("Cant search list is empty")
}

fun findDuplicate(nums: List<Int>): Int {
    var i = 0
    while(i<nums.size){
        for(j in i+1..nums.lastIndex) {
            if (nums[i] == nums[j]) return nums[i]
        }
        i++
    }
    return -1
}