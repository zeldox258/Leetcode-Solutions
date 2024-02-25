class Solution:
    def minimized_maximum_of_products_distribute(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count