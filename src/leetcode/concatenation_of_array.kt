package leetcode

fun main() {
    val result = getConcatenation(intArrayOf(1,2,1))
    print(result.toList())
}

fun getConcatenation(nums: IntArray): IntArray {
    val n = nums.size
    val ans = IntArray(2*n)

    for(i in 0 until n){
        ans[i] = nums[i]
    }

    for(i in 0 until n){
        ans[i+n] = nums[i]
    }
    return ans
}