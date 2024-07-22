from typing import List
class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        indices = list(range(len(names)))
        def height(index):
            return heights[index]
        indices.sort(key=height, reverse=True)
        sorted_names = [names[i] for i in indices]
        return sorted_names