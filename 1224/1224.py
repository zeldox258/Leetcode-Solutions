class Solution:
    def maximum_equal_frequency(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count