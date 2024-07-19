from typing import List

class Solution:
    def luckyNumbers(self, matrix: List[List[int]]) -> List[int]:
        min_in_rows = [min(row) for row in matrix]

        transposed_matrix = list(zip(*matrix))
        max_in_cols = [max(col) for col in transposed_matrix]
        lucky_numbers = []
        for r, row in enumerate(matrix):
            for c, value in enumerate(row):
                if value == min_in_rows[r] and value == max_in_cols[c]:
                    lucky_numbers.append(value)
        
        return lucky_numbers

