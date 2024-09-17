import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int diff1 = Math.abs(a - x);
            int diff2 = Math.abs(b - x);
            if (diff1 == diff2) {
                return b - a;
            }
            return diff2 - diff1;
        });

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        
        Collections.sort(result);
        return result;
    }
}
