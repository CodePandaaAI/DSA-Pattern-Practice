package patterns.arrays.slidingwindow.myapproach

fun main() {
    val arr = listOf(1, 3, 2, 6, -1, 4, 1, 8, 2)
    val k = 5
    val avgList = mutableListOf<Double>()
    var current = 0

    for(i in 0..<k){
        current += arr[i]
    }
    avgList.add(current/k.toDouble())

    for(i in k..arr.lastIndex){
        current = current - arr[i - k] + arr[i]
        avgList.add(current/k.toDouble())
    }
    println(avgList)
}