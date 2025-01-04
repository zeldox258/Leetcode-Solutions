class Solution:
    def minimum_moves_to_reach_target_in_grid(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count