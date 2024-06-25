class Solution:
    def maximum_score_of_nonoverlapping_interval(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count