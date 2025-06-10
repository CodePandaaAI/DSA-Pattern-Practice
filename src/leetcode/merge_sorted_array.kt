package leetcode

fun main() {
    merge(
        intArrayOf(0),
        0,
        intArrayOf(1),
        1
    )
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var i = 0
    for(num in m..nums1.lastIndex) {
        nums1[num] = nums2[num - i]
        i++
    }
    println(nums1.sorted())
}