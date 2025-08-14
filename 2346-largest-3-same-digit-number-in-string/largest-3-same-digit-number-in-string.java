class Solution {
    public String largestGoodInteger(String nums) {
        String ans="";
        for(int i=0;i+2<nums.length();i++){
            char a= nums.charAt(i);
            if(a==nums.charAt(i+1)&&a==nums.charAt(i+2)){
                if(ans.equals("")||a>ans.charAt(0)){
                    ans=""+a+a+a;
                }
            }

        }
        return ans;
    }
}