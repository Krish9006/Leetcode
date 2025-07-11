import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); 
        List<int[]> list = new ArrayList<>();
        int cs = intervals[0][0];
        int ce = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];   
            if (ce < s) {
                list.add(new int[]{cs, ce});
                cs = s;
                ce = e;
            } else {
                cs = Math.min(cs, s);
                ce = Math.max(ce, e);
            }
        }
        list.add(new int[]{cs, ce});
        
        return list.toArray(new int[list.size()][]);
    }
}
