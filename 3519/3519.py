class Solution:
    def count_numbers_with_nondecreasing_digits(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count