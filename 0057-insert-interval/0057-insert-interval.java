class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();        
        for (int[] current : intervals) {
            if (current[1] < newInterval[0]) {
                result.add(current);
            }
            else if (current[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = current; 
            }
            else {
                newInterval[0] = Math.min(newInterval[0], current[0]);
                newInterval[1] = Math.max(newInterval[1], current[1]);
            }
        }
        
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}
