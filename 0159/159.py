class Solution:
    def longest_substring_with_at_most_two_disti(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count