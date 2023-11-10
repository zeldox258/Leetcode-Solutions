class Solution:
    def minimum_total_space_wasted_with_k_resizi(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count