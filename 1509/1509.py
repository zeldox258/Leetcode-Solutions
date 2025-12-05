class Solution:
    def minimum_difference_between_largest_and_s(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count