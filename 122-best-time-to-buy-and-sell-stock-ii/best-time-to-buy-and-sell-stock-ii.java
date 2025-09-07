class Solution {
    public int maxProfit(int[] price) {
        int maxprofit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>price[i-1]){
                maxprofit+=price[i]-price[i-1];
            }
        }
        return maxprofit;
    }
}