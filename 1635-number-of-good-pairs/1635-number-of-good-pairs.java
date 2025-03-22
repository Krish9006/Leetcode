import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (hm.containsKey(num)) {
                count += hm.get(num);  
            }
            hm.put(num, hm.getOrDefault(num, 0) + 1); 
        }
        
        return count;
    }
}
