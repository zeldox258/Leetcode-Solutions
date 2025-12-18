class Solution:
    def number_of_subarrays_with_odd_sum(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count