class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int k=0;k<60;k++){
         long val= (long)num1-(long)k*num2;
            if (val < k) continue;  
            int setBits = Long.bitCount(val);
            if (setBits <= k) {
                return k;  
            }
        }
        return -1;
        
    }
}