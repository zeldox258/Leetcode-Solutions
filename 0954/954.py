class Solution:
    def array_of_doubled_pairs(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count