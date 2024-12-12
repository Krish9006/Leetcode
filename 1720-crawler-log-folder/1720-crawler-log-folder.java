class Solution {
    public int minOperations(String[] logs) {
        int n = logs.length;
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (logs[i].equals("../")) {
                if (d > 0) {
                    d--;
                }
            } else if (!logs[i].equals("./")) {
                d++;
            }
        }
        return d;
    }
}
