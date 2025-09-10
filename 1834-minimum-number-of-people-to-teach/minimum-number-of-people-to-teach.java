class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        List<Set<Integer>> known = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Set<Integer> set = new HashSet<>();
            for (int lang : languages[i]) {
                set.add(lang);
            }
            known.add(set);
        }

        Set<Integer> candidates = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0] - 1, v = f[1] - 1;
            boolean common = false;
            for (int lang : known.get(u)) {
                if (known.get(v).contains(lang)) {
                    common = true;
                    break;
                }
            }
            if (!common) {
                candidates.add(u);
                candidates.add(v);
            }
        }

        if (candidates.isEmpty()) return 0;
        int ans = Integer.MAX_VALUE;
        for (int lang = 1; lang <= n; lang++) {
            int cnt = 0;
            for (int user : candidates) {
                if (!known.get(user).contains(lang)) {
                    cnt++;
                }
            }
            ans = Math.min(ans, cnt);
        }

        return ans;
    }
}
