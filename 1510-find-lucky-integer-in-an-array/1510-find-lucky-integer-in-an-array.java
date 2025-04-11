class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int res = -1;
        for (int num : hm.keySet()) {
            if (num == hm.get(num)) {
                res = Math.max(res, num);
            }
        }
        return res;
    }
}
