class Solution:
    def substrings_of_size_three_with_distinct_c(self, nums: List[int]) -> int:
        l, r, res = 0, len(nums) - 1, 0
        while l < r:
            res = max(res, min(nums[l], nums[r]) * (r - l))
            if nums[l] < nums[r]:
                l += 1
            else:
                r -= 1
        return res