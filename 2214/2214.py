class Solution:
    def minimum_health_to_beat_game(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count