class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26]; 
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i); 
            if (c >= 'a' && c <= 'z' && !seen[c - 'a']) { 
                seen[c - 'a'] = true; 
                count++; 
            }
            if (count == 26) return true;
        }
        return false;
    }
}
