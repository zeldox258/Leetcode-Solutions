class Solution:
    def minimum_sideway_jumps(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count