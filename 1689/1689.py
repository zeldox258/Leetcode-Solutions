class Solution:
    def partitioning_into_minimum_number_of_deci(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count