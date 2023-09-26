class Solution:
    def cyclically_rotating_a_grid(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count