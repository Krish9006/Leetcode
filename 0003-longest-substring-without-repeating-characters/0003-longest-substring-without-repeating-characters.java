class Solution {
    public int lengthOfLongestSubstring(String s) {
      int p1=0,p2=0;
        int n=s.length();int maxlen=0;
   HashSet<Character> set = new HashSet<>();
        while(p2<n){
            char ch= s.charAt(p2);
            if(!set.contains(ch)){
                set.add(ch);
                maxlen=Math.max(maxlen,p2-p1+1);
                p2++;
            }
            else{
                set.remove(s.charAt(p1));
                p1++;
            }
            
        }
        return maxlen;
    }
}