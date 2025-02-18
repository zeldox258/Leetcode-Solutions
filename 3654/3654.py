class Solution:
    def minimum_sum_after_divisible_sum_deletion(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count