import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>(); // Corrected List type
        solve(res, "", 0, 0, n);
        return res;    
    }

    private void solve(List<String> res, String s, int ob, int cb, int n) {
        if (s.length() == 2 * n) { // Corrected length condition
            res.add(s);
            return;
        }

        if (ob < n) { // Add '(' when open brackets are less than n
            solve(res, s + "(", ob + 1, cb, n);
        }

        if (cb < ob) { // Add ')' only if cb < ob
            solve(res, s + ")", ob, cb + 1, n);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.generateParenthesis(3)); 
       
    }
}
