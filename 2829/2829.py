class Solution:
    def determine_the_minimum_sum_of_a_kavoiding(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count