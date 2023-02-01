class Solution:
    def minimum_moves_to_make_array_complementar(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count