class Solution {
    public boolean reorderedPowerOf2(int n) {
        String original = Integer.toString(n);
        int[] originalCount = countDigits(original);
        for (int i = 0; i < 31; i++) {
            int power = 1 << i; 
            if (power > 1000000000) break; 
            int[] powerCount = countDigits(Integer.toString(power));
            if (matches(originalCount, powerCount)) {
                return true;
            }
        }
        return false;
    }

    private int[] countDigits(String s) {
        int[] count = new int[10];
        for (char c : s.toCharArray()) {
            count[c - '0']++;
        }
        return count;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
