class Solution:
    def matrix_block_sum(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count