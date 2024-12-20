class Solution:
    def minimum_time_to_transport_all_individual(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count