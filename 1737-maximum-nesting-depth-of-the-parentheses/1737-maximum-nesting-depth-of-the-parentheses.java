class Solution {
    public int maxDepth(String s) {
      int n= s.length();
      int x=0,count=0;
      for(int i=0;i<n;i++){
        if(s.charAt(i)=='('){
            x++;
            count=Math.max(x,count);
        }
        if(s.charAt(i)==')'){
            x--;
        }
      }
      return count;  
    }
}