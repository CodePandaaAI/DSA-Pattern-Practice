package patterns.arrays.search.binarysearch.myapproach

fun main() {
    val arr = listOf(2, 5, 8, 12, 14, 19, 25, 31, 40, 55, 100)
    val target = 1
    val result = getStartEnd(arr, target)
    var start = result.first()
    var end = result.last()
    while(start<=end){
        val mid = (start + end ) /2
        when {
            arr[mid] == target -> {
                println("target found at index $mid")
                break
            }
            arr[mid] > target -> end = mid - 1
            arr[mid] < target-> start = mid + 1
            else -> println("Unexpected")
        }
    }
}

fun getStartEnd(arr: List<Int>, target: Int) : List<Int> {
    var start = 0
    var end = 1
    while (target > arr[end]) {
        start = end
        end *= 2
    }

    return listOf(start, end)
}