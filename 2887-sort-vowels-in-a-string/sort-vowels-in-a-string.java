class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        Set<Character> vowel= new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        List<Character> vowellist= new ArrayList<>();
        for(char c:s.toCharArray()){
            if(vowel.contains(c)){
                vowellist.add(c);
            }

        }
        Collections.sort(vowellist);
        StringBuilder  sb= new StringBuilder();
        int v=0;
        for(char c:s.toCharArray()){
            if(vowel.contains(c)){
                sb.append(vowellist.get(v));
                v++;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}