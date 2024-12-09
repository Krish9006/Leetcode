import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (st.isEmpty() || st.peek() != ch) {
                st.push(ch);
            } else {
                st.pop();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
}
