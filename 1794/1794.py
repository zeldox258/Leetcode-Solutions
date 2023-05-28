class Solution:
    def count_pairs_of_equal_substrings_with_min(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count