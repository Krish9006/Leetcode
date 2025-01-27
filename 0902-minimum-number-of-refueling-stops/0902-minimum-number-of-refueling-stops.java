class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
         PriorityQueue<Integer> hm = new PriorityQueue<>(Collections.reverseOrder());
        int n=stations.length;
        int count=0;
        int currfuel=startFuel;
        int i=0;
        while(currfuel<target){
             while (i < n && stations[i][0] <= currfuel) {
                hm.add(stations[i][1]); 
                i++;
            }
            if(hm.isEmpty()){
                return -1;
            }
        currfuel+=hm.poll();
        count++;
        }
        return count;
          
    }
}