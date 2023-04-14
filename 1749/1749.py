class Solution:
    def maximum_absolute_sum_of_any_subarray(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count