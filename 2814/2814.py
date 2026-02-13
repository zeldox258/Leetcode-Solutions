class Solution:
    def minimum_time_takes_to_reach_destination_(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count