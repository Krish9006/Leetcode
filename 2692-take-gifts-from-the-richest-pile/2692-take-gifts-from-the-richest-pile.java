class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int gift:gifts){
            pq.add(gift);
        }
        while(k-->0&&!pq.isEmpty()){
            int max =pq.poll();
            pq.add((int)Math.floor(Math.sqrt(max)));
        }
        long sum=0;
        while(!pq.isEmpty()){
        sum+=pq.poll();
        }
        return sum;
        
    }
}