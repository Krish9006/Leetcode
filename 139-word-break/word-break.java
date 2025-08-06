class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd = false;
}
class Solution {
    TrieNode root = new TrieNode();
    public void insert(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()) {
            if(node.children[ch - 'a'] == null) {
                node.children[ch - 'a'] = new TrieNode();
            }
            node = node.children[ch - 'a'];
        }
        node.isEnd = true;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for(String word : wordDict) {
            insert(word);
        }
        Boolean[] dp = new Boolean[s.length()];
        return solve(s, 0, dp);
    }
    private boolean solve(String s, int i, Boolean[] dp) {
        if(i == s.length()) return true;
        if(dp[i] != null) return dp[i];

        TrieNode node = root;
        for(int j = i; j < s.length(); j++) {
            char ch = s.charAt(j);
            if(node.children[ch - 'a'] == null) break;
            node = node.children[ch - 'a'];
            if(node.isEnd && solve(s, j + 1, dp)) {
                return dp[i] = true;
            }
        }
        return dp[i] = false;
    }
}
