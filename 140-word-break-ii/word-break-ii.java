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
    public List<String> wordBreak(String s, List<String> wordDict) {
        for(String word : wordDict) {
            insert(word);
        }
        Map<Integer, List<String>> memo = new HashMap<>();
        return solve(s, 0, memo);
    }
    private List<String> solve(String s, int index, Map<Integer, List<String>> memo) {
        if (memo.containsKey(index)) return memo.get(index);
        List<String> result = new ArrayList<>();
        if (index == s.length()) {
            result.add(""); 
            return result;
        }
        TrieNode node = root;
        for (int i = index; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (node.children[ch - 'a'] == null) break;
            node = node.children[ch - 'a'];
            if (node.isEnd) {
                String prefix = s.substring(index, i + 1);
                List<String> suffixSentences = solve(s, i + 1, memo);
                for (String sentence : suffixSentences) {
                    if (sentence.isEmpty()) {
                        result.add(prefix);
                    } else {
                        result.add(prefix + " " + sentence);
                    }
                }
            }
        }
        memo.put(index, result);
        return result;
    }
}
