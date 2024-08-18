from typing import List

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        no_of_zeroes = 0
        no_of_ones = 0
        
 
        for i in range(len(nums)):
            if nums[i] == 0:
                no_of_zeroes += 1
            elif nums[i] == 1:
                no_of_ones += 1
        
      
        for i in range(len(nums)):
            if i < no_of_zeroes:
                nums[i] = 0
            elif i < no_of_zeroes + no_of_ones:
                nums[i] = 1
            else:
                nums[i] = 2


