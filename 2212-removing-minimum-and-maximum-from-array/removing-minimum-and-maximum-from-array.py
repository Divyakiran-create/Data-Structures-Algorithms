class Solution:
    def minimumDeletions(self, nums: list[int]) -> int:
        n = len(nums)
        min_idx = nums.index(min(nums))
        max_idx = nums.index(max(nums))
        
        # Strategy 1: Remove from front only
        front_only = max(min_idx, max_idx) + 1
        
        # Strategy 2: Remove from back only
        back_only = n - min(min_idx, max_idx)
        
        # Strategy 3: Remove from both front and back
        both_ends = (min(min_idx, max_idx) + 1) + (n - max(min_idx, max_idx))
        
        return min(front_only, back_only, both_ends)
