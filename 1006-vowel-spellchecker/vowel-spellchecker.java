class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        for (String word : wordlist) {
            String lower = word.toLowerCase();
            caseMap.putIfAbsent(lower, word);
            vowelMap.putIfAbsent(devowel(lower), word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exactWords.contains(q)) {
                result[i] = q;
            } else {
                String lowerQ = q.toLowerCase();
                if (caseMap.containsKey(lowerQ)) {
                    result[i] = caseMap.get(lowerQ);
                } else {
                    String vQ = devowel(lowerQ);
                    if (vowelMap.containsKey(vQ)) {
                        result[i] = vowelMap.get(vQ);
                    } else {
                        result[i] = "";
                    }
                }
            }
        }
        return result;
    }

    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) sb.append('*');
            else sb.append(c);
        }
        return sb.toString();
    }
}
