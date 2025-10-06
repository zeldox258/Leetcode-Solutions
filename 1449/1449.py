class Solution:
    def form_largest_integer_with_digits_that_ad(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count