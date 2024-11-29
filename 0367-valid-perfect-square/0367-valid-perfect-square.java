class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false; 
        }

      long l=0,h=num;
      while(l<=h){
        long m=l+(h-l)/2;
        long ans=m*m;
        if(ans==num){
            return true;
        }
        else if(ans<num){
            l=m+1;
        }
        else{
            h=m-1;
        }
      }
      return false;
    }
}