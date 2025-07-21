class Solution:
    def minimum_time_to_eat_all_grains(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count