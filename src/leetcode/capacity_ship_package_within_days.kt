package leetcode

fun main() {
    val result = shipWithinDays(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5)
    print(result)
}

fun shipWithinDays(weights: IntArray, days: Int): Int {
    var low = weights.maxOrNull()!!
    var high = weights.sum()
    var answer = high

    while (low <= high) {
        val mid = (low + high) / 2

        if (canShip(weights, mid, days)) {
            answer = mid
            high = mid - 1
        } else {
            low = mid + 1
        }
    }

    return answer
}

private fun canShip(weights: IntArray, capacity: Int, days: Int): Boolean {
    var daysUsed = 1
    var currentLoad = 0

    for (weight in weights) {
        if (currentLoad + weight > capacity) {
            daysUsed++
            currentLoad = 0
        }
        currentLoad += weight
    }

    return daysUsed <= days
}