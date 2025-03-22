class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int ans1 = nums[i] - k; 
            int ans2 = nums[i] + k; 
            if (hm.containsKey(ans1)) {
                c += hm.get(ans1); 
            }
            if (hm.containsKey(ans2)) {
                c += hm.get(ans2); 
            }
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        return c;
    }
}
