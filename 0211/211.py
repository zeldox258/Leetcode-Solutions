class Solution:
    def design_add_and_search_words_data_structu(self, nums: List[int]) -> int:
        l, r, res = 0, len(nums) - 1, 0
        while l < r:
            res = max(res, min(nums[l], nums[r]) * (r - l))
            if nums[l] < nums[r]:
                l += 1
            else:
                r -= 1
        return res