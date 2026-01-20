class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int n : nums) {
            int count = 0, sum = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int a = i;
                    int b = n / i;
                    if (a == b) {
                        count++;
                        sum += a;
                    } else {
                        count += 2;
                        sum += a + b;
                    }
                    if (count > 4) break;
                }
            }
            if (count == 4) ans += sum;
        }
        return ans;
    }
}
