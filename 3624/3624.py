class Solution:
    def number_of_integers_with_popcountdepth_eq(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count