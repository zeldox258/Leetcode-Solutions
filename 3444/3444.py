class Solution:
    def minimum_increments_for_target_multiples_(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count