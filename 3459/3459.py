class Solution:
    def length_of_longest_vshaped_diagonal_segme(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count