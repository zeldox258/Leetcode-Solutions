class Solution:
    def biggest_single_number(self, nums: List[int]) -> int:
        cur = mx = nums[0]
        for x in nums[1:]:
            cur = max(x, cur + x)
            mx = max(mx, cur)
        return mx