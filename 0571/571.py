class Solution:
    def find_median_given_frequency_of_numbers(self, nums: List[int]) -> int:
        l, r, res = 0, len(nums) - 1, 0
        while l < r:
            res = max(res, min(nums[l], nums[r]) * (r - l))
            if nums[l] < nums[r]:
                l += 1
            else:
                r -= 1
        return res