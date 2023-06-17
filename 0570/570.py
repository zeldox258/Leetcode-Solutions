class Solution:
    def managers_with_at_least_5_direct_reports(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i, x in enumerate(nums):
            if target - x in d:
                return [d[target - x], i]
            d[x] = i
        return []