class Solution {
    public int maxProfit(int[] prices) {
        // sliding window, right var move when condition is good
        // move left when condition is no longer satisfied
        int profit = 0, n = prices.length;
        int i = 0, j = 1;
        while (j<n){
            while (j<n && prices[j]>=prices[i]){
                profit = Math.max(prices[j]-prices[i], profit);
                j++;
            }
            if (j<n && prices[j]<prices[i]){
                i = j;
                j++;
            }
            
        }
        return profit;
    }
}