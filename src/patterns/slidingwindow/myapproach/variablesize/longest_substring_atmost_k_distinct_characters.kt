package patterns.slidingwindow.myapproach.variablesize

fun main() {
    val s = "eceba"
    val k = 2
    val currentList = mutableSetOf<Char>()
    var max = 0
    var start = 0

    for (i in 0..s.length - 1) {
        if (!currentList.contains(s[i])) {
            currentList.add(s[i])
        }
        else{
            max++
        }
        println(currentList)
        if (currentList.size > k) {
            currentList.remove(s[start])
            start++
        }
        max = maxOf(max, currentList.size)
    }
    println(max)
}