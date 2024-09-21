class Solution:
    def longest_palindrome_after_substring_conca(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count