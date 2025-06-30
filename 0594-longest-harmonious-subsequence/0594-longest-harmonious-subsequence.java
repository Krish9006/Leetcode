class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxlength = 0;
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int key : hm.keySet()) {
            if (hm.containsKey(key + 1)) {
                int length = hm.get(key) + hm.get(key + 1);
                maxlength = Math.max(maxlength, length);
            }
        }

        return maxlength;
    }
}
