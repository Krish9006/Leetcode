class Solution {
    public int maxProfit(int[] prices) {
      int min_price = prices[0];
       int maxprofit=0;
      for(int i=1;i<prices.length;i++){
        maxprofit=Math.max(maxprofit,prices[i]-min_price);
         min_price = Math.min(prices[i],min_price);
      }
      return maxprofit;  
    }

}