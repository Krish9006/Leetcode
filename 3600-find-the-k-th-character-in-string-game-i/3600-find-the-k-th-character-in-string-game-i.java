class Solution {
    public char kthCharacter(int k) { 
        String word = "a";
        
        while (word.length() < k) {
            StringBuilder newPart = new StringBuilder();
            for (char c : word.toCharArray()) {
                newPart.append((char)((c - 'a' + 1) % 26 + 'a'));
            }
            word += newPart.toString();
        }
        
        return word.charAt(k - 1); 
    }
}
