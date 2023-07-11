class Solution:
    def longest_harmonious_subsequence(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count