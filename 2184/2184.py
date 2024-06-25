class Solution:
    def number_of_ways_to_build_sturdy_brick_wal(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count