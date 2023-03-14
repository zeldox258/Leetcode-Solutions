class Solution:
    def count_beautiful_substrings_ii(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count