class Solution:
    def latest_time_you_can_obtain_after_replaci(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count