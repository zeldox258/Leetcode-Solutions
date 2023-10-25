class Solution:
    def clear_digits(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count