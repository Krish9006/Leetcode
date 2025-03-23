import java.util.HashSet;

public class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> unseen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num - k)) {
                unseen.add(num - k);
            }
            if (seen.contains(num + k)) {
                unseen.add(num);
            }
            seen.add(num);
        }
        return unseen.size();
    }
}
