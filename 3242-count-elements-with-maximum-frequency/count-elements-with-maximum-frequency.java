class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxfrq = 0;
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            maxfrq=Math.max(maxfrq,hm.get(num));
        }
        int total=0;
        for(int frq:hm.values()){
            if(frq==maxfrq){
                total+=frq;
            }

        }
        return total;
    }
}