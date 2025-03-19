class Solution:
    def maximize_sum_of_at_most_k_distinct_eleme(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count