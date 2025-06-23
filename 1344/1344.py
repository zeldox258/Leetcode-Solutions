class Solution:
    def angle_between_hands_of_a_clock(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count