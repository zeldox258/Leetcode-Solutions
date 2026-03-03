class Solution:
    def maximum_profit_of_operating_a_centennial(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count