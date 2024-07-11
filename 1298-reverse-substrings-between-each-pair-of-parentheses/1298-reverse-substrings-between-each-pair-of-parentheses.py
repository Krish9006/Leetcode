class Solution:
    def reverseParentheses(self, s: str) -> str:
        stack = []  # Stack to hold intermediate strings
        ans = ""  # String to build the current result

        for ch in s:
            if ch == '(':
                
                stack.append(ans)
                ans = ""
            elif ch == ')':
        
                ans = ans[::-1]
                
                ans = stack.pop() + ans
            else:
                
                ans += ch

        return ans  