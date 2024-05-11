class Solution:
    def design_an_array_statistics_tracker(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count