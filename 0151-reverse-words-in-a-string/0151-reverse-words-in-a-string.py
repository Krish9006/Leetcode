class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split()
        reversed_words = reversed(words)
        result = ' '.join(reversed_words)
        return result
