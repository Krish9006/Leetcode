class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int[] a = nums.clone();
                int curr = i, dir = 1;
                while (curr >= 0 && curr < n) {
                    if (a[curr] == 0) curr += dir;
                    else {
                        a[curr]--;
                        dir = -dir;
                        curr += dir;
                    }
                }
                boolean ok = true;
                for (int x : a) if (x != 0) ok = false;
                if (ok) ans++;

                a = nums.clone();
                curr = i; dir = -1;
                while (curr >= 0 && curr < n) {
                    if (a[curr] == 0) curr += dir;
                    else {
                        a[curr]--;
                        dir = -dir;
                        curr += dir;
                    }
                }
                ok = true;
                for (int x : a) if (x != 0) ok = false;
                if (ok) ans++;
            }
        }
        return ans;
    }
}
