package patterns.arrays.slidingwindow.myapproach

fun main() {
    val arr = listOf(2, 1, 5, 1, 3, 2)
    val k = 3
    var current = 0
    val maxSumList = mutableListOf<Int>()

    for(i in 0..<k) {
        current += arr[i]
        maxSumList.add(i)
    }
    var max = current


    for(i in k..arr.lastIndex){
        current = current - arr[i-k] + arr[i]
        if(current> max){
            maxSumList.clear()
            maxSumList.add(arr[i-2])
            maxSumList.add(arr[i-1])
            maxSumList.add(arr[i])
            max = current
        }
    }
    println(maxSumList)
}