import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hp.put(nums[i], hp.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> {
                int freqCompare = a.getValue() - b.getValue();
                if (freqCompare == 0) {
                    return b.getKey() - a.getKey();
                }
                return freqCompare;
            }
        );
        
        pq.addAll(hp.entrySet());
        
        int[] res = new int[nums.length];
        int index = 0;
        while (!pq.isEmpty()) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            int num = entry.getKey();
            int freq = entry.getValue();
            
            for (int i = 0; i < freq; i++) {
                res[index++] = num;
            }
        }
        
        return res;
    }
}
