import java.util.*;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> 
            Double.compare(gain(b[0],b[1]), gain(a[0],a[1])));
        
        for (int[] c : classes) pq.add(c);
        
        while (extraStudents-- > 0) {
            int[] cur = pq.poll();
            cur[0]++;
            cur[1]++;
            pq.add(cur);
        }
        
        double sum = 0;
        for (int[] c : pq) sum += (double)c[0]/c[1];
        return sum / classes.length;
    }
    
    private double gain(int pass, int total) {
        return (double)(pass+1)/(total+1) - (double)pass/total;
    }
}
