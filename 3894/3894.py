class Solution:
    def traffic_signal_color(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count