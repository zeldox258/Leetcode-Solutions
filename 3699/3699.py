class Solution:
    def number_of_zigzag_arrays_i(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count