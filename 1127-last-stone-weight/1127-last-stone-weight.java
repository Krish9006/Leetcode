class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> arr=new PriorityQueue<>(Collections.reverseOrder());
        for( int i=0;i<stones.length;i++){
            arr.add(stones[i]);
        }
            while(arr.size()>1){
                int y=arr.remove();
                 int x=arr.remove();
                 if(x!=y)arr.add(y-x);
            }
            if(arr.size()==0){
                return 0;
            }
                 return arr.poll();
          
    }
}