import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);  // sort by start time

        List<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {
            // if list is empty or no overlap
            if (list.isEmpty() || list.get(list.size() - 1)[1] < interval[0]) {
                list.add(interval);
            } else {
                // overlapping: merge by updating the end
                list.get(list.size() - 1)[1] = 
                    Math.max(list.get(list.size() - 1)[1], interval[1]);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
