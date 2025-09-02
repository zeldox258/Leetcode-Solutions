class Solution:
    def maximum_distinct_path_sum_in_a_binary_tr(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count