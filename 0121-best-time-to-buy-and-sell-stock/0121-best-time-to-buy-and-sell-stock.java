class Solution {
    public int maxProfit(int[] prices) {
        int minporfit = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0 ; i<prices.length; i++){
            if(prices[i]<minporfit){
                  minporfit = prices[i];
            }
            else if(prices[i] - minporfit > maxprofit){
                maxprofit = prices[i] - minporfit;
            }

        }
        return maxprofit;
    }
}