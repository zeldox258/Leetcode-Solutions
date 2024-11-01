class Solution:
    def number_of_submatrices_that_sum_to_target(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count