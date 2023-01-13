class Solution:
    def reshape_data_pivot(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count