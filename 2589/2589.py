class Solution:
    def minimum_time_to_complete_all_tasks(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count