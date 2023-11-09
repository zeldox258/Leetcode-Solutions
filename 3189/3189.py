class Solution:
    def minimum_moves_to_get_a_peaceful_board(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count