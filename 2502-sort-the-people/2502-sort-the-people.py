from typing import List

class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        sorted_heights = sorted(heights, reverse=True)
        sorted_names = []
        while sorted_heights:
            max_height = sorted_heights.pop(0)
            index = heights.index(max_height)
            sorted_names.append(names[index])
            heights.pop(index)
            names.pop(index)
        
        return sorted_names
