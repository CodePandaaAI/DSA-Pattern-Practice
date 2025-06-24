package leetcode


fun main() {
    val result = twoSum(intArrayOf(2,2,1,4), 4)
    print(result.toList())
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    for(num in 0 until nums.size-1){
        for(j in num+1 until nums.size){
            if(nums[num] + nums[j] == target) return intArrayOf(num, j)
        }
    }
    return intArrayOf(-1)
}