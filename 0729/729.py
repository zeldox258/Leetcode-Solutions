class Solution:
    def my_calendar_i(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count