class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int uniqueCount = 1;

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            
            int segmentLength = j - i;
            if (segmentLength > 1) {
                uniqueCount += segmentLength - 1;
            }

            i = j - 1;
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.possibleStringCount("abbcccc")); // Output: 5
        System.out.println(sol.possibleStringCount("abcd"));    // Output: 1
        System.out.println(sol.possibleStringCount("aaaa"));    // Output: 4
    }
}
