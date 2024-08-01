from collections import defaultdict
from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = defaultdict(list)
        for i in strs:
            sorted_i = ''.join(sorted(i))
            map[sorted_i].append(i)
        return list(map.values())
