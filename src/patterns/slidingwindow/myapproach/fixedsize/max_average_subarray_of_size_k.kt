package patterns.slidingwindow.myapproach.fixedsize

fun main() {
    val arr = listOf(1, 12, -5, -6, 50, 3)
    val k = 4
    var currentSum = 0.0
    var currentAvg: Double
    for(i in 0..<k){
        currentSum += arr[i]
    }
    currentAvg = currentSum/k.toDouble()
    var maxAvg = currentAvg
    
    for(i in k..arr.lastIndex){
        currentSum = currentSum - arr[i - k] + arr[i]
        currentAvg = currentSum / k.toDouble()
        if(currentAvg>maxAvg){
            maxAvg = currentAvg
        }
    }
    println(maxAvg)
}