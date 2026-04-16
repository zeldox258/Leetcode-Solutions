class Solution:
    def count_distinct_subarrays_divisible_by_k_(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count