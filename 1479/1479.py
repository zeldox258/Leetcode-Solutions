class Solution:
    def sales_by_day_of_the_week(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count