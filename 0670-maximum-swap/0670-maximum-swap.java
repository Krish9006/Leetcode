class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int max = -1, iMax = -1, i1 = -1, i2 = -1;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] > max) {
                max = digits[i];
                iMax = i;
            } else if (digits[i] < max) {
                i1 = i;
                i2 = iMax;
            }
        }

        if (i1 != -1) {
            char temp = digits[i1];
            digits[i1] = digits[i2];
            digits[i2] = temp;
        }

        return Integer.parseInt(new String(digits));
    }
}
