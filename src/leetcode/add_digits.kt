package leetcode

fun main() {
    val num = 1029
    var numStr = num.toString()

    while (numStr.length > 1) {
        var sum = 0
        for (i in 0..numStr.length - 1){
            sum += numStr[i].toString().toInt()
        }
        numStr = sum.toString()
    }
    print(numStr.toInt())
}