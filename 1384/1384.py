class Solution:
    def total_sales_amount_by_year(self, nums: List[int]) -> int:
        cur = mx = nums[0]
        for x in nums[1:]:
            cur = max(x, cur + x)
            mx = max(mx, cur)
        return mx