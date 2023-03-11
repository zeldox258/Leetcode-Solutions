class Solution:
    def sum_of_special_evenlyspaced_elements_in_(self, nums: List[int]) -> int:
        cur = mx = nums[0]
        for x in nums[1:]:
            cur = max(x, cur + x)
            mx = max(mx, cur)
        return mx