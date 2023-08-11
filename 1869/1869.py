class Solution:
    def longer_contiguous_segments_of_ones_than_(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count