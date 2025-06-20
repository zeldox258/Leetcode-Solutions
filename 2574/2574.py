class Solution:
    def left_and_right_sum_differences(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count