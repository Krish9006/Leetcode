class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int[] prefixodd = new int[n + 1];
        int[] prefixeven = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixeven[i + 1] = prefixeven[i];
            prefixodd[i + 1] = prefixodd[i];
            if (i % 2 == 0) {
                prefixeven[i + 1] += nums[i];
            } else {
                prefixodd[i + 1] += nums[i];
            }
        }

        int faircount = 0;

        for (int i = 0; i < n; i++) {
            int lefteven = prefixeven[i];
            int leftodd = prefixodd[i];
            int rghteven = prefixodd[n] - prefixodd[i + 1];
            int rightodd = prefixeven[n] - prefixeven[i + 1];

            if (lefteven + rghteven == leftodd + rightodd) {
                faircount++;
            }
        }

        return faircount;
    }
}
