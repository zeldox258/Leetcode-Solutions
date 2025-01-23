class Solution:
    def product_price_at_a_given_date(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count