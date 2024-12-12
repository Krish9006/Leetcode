class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!st.isEmpty() && Math.abs(st.peek() - current) == 32) {
                st.pop();
            } else {
                st.push(current);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }
        return result.toString();
    }
}
