package leetcode

//fun maxProfit(prices: IntArray): Int {
//    if(prices.size == 1) return 0
//
//    var totalProfit: Pair<Int, Int> = Pair(0,0)
//    var pr = Int.MIN_VALUE
//
//    for(stocki in 0..prices.size-2){
//
//        val initialPrice = prices[stocki]
//
//        for(stockj in stocki+1..prices.size-1){
//            var maxProfit = prices[stockj]
//
//            if(prices[stockj] > initialPrice && prices[stockj] > maxProfit){
//
//                totalProfit = Pair(initialPrice, maxProfit)
//
//            }
//        }
//        if(totalProfit.second - totalProfit.first)
//    }
//}

fun maxProfit(prices: IntArray): Int {
    if (prices.size <= 1) { // If there's 0 or 1 day, no profit can be made
        return 0
    }

    var minPrice = prices[0] // Initialize minPrice with the first day's price
    var maxProfit = 0        // Initialize maxProfit to 0

    // Start from the second day, as we need at least one day to sell after buying
    for (i in 1 until prices.size) {
        val currentPrice = prices[i]

        // Calculate potential profit if we sell today using the minPrice found so far
        val profitToday = currentPrice - minPrice

        // Update maxProfit if current profit is greater
        if (profitToday > maxProfit) {
            maxProfit = profitToday
        }

        // Update minPrice if currentPrice is even lower
        // This ensures minPrice always holds the lowest price encountered up to 'i'
        if (currentPrice < minPrice) {
            minPrice = currentPrice
        }
    }

    return maxProfit
}