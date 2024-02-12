object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var buyat = prices(0)
        var maxprofit = 0
        var currprofit = 0

        for(i <- 1 until prices.length){
            buyat = Math.min(buyat, prices(i))
            currprofit = prices(i) - buyat
            maxprofit = Math.max(maxprofit, currprofit)
        }
        return maxprofit
    }
}