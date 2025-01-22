class Solution {
    public int lastStoneWeight(int[] arr) {
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
         }
         while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
    
         if(x!=y){
            pq.add(x-y);
         }
    }
         return pq.isEmpty() ? 0 : pq.poll();
        
}
}