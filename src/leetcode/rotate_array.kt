package leetcode

//fun main() {
//    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
//    val newArray = arr.toMutableList()
//    for(i in newArray.size-1 downTo newArray.size-3){
//        newArray.addFirst(arr[i])
//    }
//    for(i in newArray.size-1 downTo newArray.size-3){
//        newArray.removeLast()
//    }
//    for(num in 0..arr.size-1){
//        arr[num] = newArray[num]
//    }
//    print(newArray)
//}

fun main() {
    val arr = intArrayOf(-1, -100, 3, 99)
    val k = 2
    rotate(arr, k)
    print(arr.toList())
}

fun rotate(nums: IntArray, k: Int): Unit {
    val n = nums.size
    if (n == 0) return

    val effectiveK = k % n

    if (effectiveK == 0) return

    val tempArray = IntArray(n)

    for (i in 0 until effectiveK) {
        tempArray[i] = nums[n - effectiveK + i]
    }

    for (i in 0 until n - effectiveK) {
        tempArray[effectiveK + i] = nums[i]
    }

    for (i in 0 until n) {
        nums[i] = tempArray[i]
    }
}