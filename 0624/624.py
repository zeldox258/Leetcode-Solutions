class Solution:
    def maximum_distance_in_arrays(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count