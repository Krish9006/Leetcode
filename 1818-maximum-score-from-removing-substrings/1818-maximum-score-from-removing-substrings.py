class Solution:
    def maximumGain(self, s: str, x: int, y: int) -> int:
        def remove_substring(s, first, second, points):
            stack = []
            score = 0
            for char in s:
                if stack and stack[-1] == first and char == second:
                    stack.pop()
                    score += points
                else:
                    stack.append(char)
            return ''.join(stack), score
        
  
        if x < y:
            s = s[::-1]
            x, y = y, x


        s, score1 = remove_substring(s, 'a', 'b', x)
        

        s, score2 = remove_substring(s, 'b', 'a', y)
        
        return score1 + score2

