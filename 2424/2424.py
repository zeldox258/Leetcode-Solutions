class Solution:
    def longest_uploaded_prefix(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count