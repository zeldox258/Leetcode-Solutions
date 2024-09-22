class Solution:
    def two_city_scheduling(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count