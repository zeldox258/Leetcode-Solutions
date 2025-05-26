class Solution:
    def maximum_sum_of_three_numbers_divisible_b(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i, x in enumerate(nums):
            if target - x in d:
                return [d[target - x], i]
            d[x] = i
        return []