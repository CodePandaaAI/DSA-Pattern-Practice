package patterns.slidingwindow.myapproach

fun main() {
    val arr = listOf(1, 3, 5, 2, 8, 1, 5)
    val k = 3
    val sumList = mutableListOf<Int>()
    var current = 0

    for (i in 0..<k) {
        current += arr[i]
    }
    sumList.add(current)

    for(i in k..arr.size-1){
        current = current - arr[i - k] + arr[i]
        sumList.add(current)
    }

    println(sumList)
}