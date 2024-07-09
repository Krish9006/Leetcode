from typing import List

class Solution:
    def averageWaitingTime(self, customers: List[List[int]]) -> float:
        total_waiting_time = 0
        curr_time = 0
        
        for arrival, time_needed in customers:
            if curr_time < arrival:
                curr_time = arrival
            curr_time += time_needed
            total_waiting_time += curr_time - arrival
        
        return total_waiting_time / len(customers)
