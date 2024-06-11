class Solution:
    def smallest_substring_with_identical_charac(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count