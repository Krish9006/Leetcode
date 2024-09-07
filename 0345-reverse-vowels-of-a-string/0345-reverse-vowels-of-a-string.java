class Solution {
    public String reverseVowels(String a) {
        char[] word = a.toCharArray();
        int s = 0;
        int e = a.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (s < e) {
            while (s < e && vowels.indexOf(word[s]) == -1) {
                s++;
            }
            while (s < e && vowels.indexOf(word[e]) == -1) {
                e--;
            }
            char temp = word[s];
            word[s] = word[e];
            word[e] = temp;
            s++;
            e--;
        }
        String ans = new String(word);
        return ans;
    }
}
