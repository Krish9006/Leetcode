class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int index = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                ans[index++] = num;
            } else {
                set.add(num);
            }
        }
        return ans;
    }
}
