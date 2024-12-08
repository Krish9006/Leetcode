class Solution {
    public String reverseWords(String s) {
       s= s.trim();
        String[] word=s.split("\\s+");
        int left=0,right=word.length-1;
        while(left<right){
            String temp=word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        return String.join(" ",word);
    }
}