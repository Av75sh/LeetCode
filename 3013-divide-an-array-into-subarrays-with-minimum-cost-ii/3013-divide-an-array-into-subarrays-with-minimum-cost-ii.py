from sortedcontainers import SortedList
from typing import List

class Solution:
    def minimumCost(self, nums: List[int], k: int, dist: int) -> int:
        n = len(nums)
        window_size = k - 1
        
        max_idx = min(n - 1, 1 + dist)
        
        small = SortedList()  
        large = SortedList() 
        
        for i in range(1, max_idx + 1):
            small.add((nums[i], i))
            if len(small) > window_size:
                large.add(small.pop())
        
        current_sum = nums[0] + sum(val for val, _ in small)
        min_cost = current_sum
        
        left = 1
        right = max_idx
        
        while right < n - 1:
            if (nums[left], left) in small:
                small.remove((nums[left], left))
                current_sum -= nums[left]
                if large and len(small) < window_size:
                    val, idx = large.pop(0)
                    small.add((val, idx))
                    current_sum += val
            elif (nums[left], left) in large:
                large.remove((nums[left], left))
            
            right += 1
            new_elem = (nums[right], right)
            
            if len(small) < window_size:
                small.add(new_elem)
                current_sum += nums[right]
            elif new_elem < small[-1]:
                removed = small.pop()
                current_sum -= removed[0]
                large.add(removed)
                
                small.add(new_elem)
                current_sum += nums[right]
            else:
                large.add(new_elem)
            
            left += 1
            min_cost = min(min_cost, current_sum)
        
        return min_cost