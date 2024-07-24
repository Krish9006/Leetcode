from typing import List

class Solution:
    def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
        def mapped_value(num: int) -> int:
            mapped_str = ''.join(str(mapping[int(digit)]) for digit in str(num))
            return int(mapped_str)
        
        sorted_nums = sorted(nums, key=mapped_value)
        return sorted_nums
