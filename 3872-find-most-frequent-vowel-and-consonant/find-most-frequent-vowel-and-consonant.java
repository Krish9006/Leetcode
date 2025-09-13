class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        String vowels="aeiou";
        for(int i=0;i<s.length();i++){
       char ch=s.charAt(i);
         hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        int maxvowel=0;
        int maxconstant=0;
        for(char ch:hm.keySet()){
            int freq=hm.get(ch);
            if(vowels.indexOf(ch)!=-1){
                maxvowel=Math.max(maxvowel,freq);
            }
            else{
                maxconstant=Math.max(maxconstant,freq);            }
        }
        return maxvowel+maxconstant;
        
    }
}