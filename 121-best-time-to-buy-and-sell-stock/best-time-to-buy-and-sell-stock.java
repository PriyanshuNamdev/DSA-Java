class Solution {
    public int maxProfit(int[] prices) {
        int buyVal = prices[0];
        int max_Profit = 0;
        int profit = 0;
        int n = prices.length;
        for(int i =0;i<n;i++){
            buyVal = Math.min(prices[i],buyVal);
            profit = prices[i] - buyVal;
            max_Profit = Math.max(max_Profit,profit);
            }
        return max_Profit;
    }
}