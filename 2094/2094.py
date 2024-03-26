class Solution:
    def finding_3digit_even_numbers(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count