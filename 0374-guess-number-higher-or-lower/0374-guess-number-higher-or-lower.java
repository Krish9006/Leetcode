public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1, h = n;
        while (l <= h) {
            int m = l + (h - l) / 2;
            int res = guess(m);
            if (res == 0) {
                return m;
            } else if (res == -1) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
