class Solution:
    def minimum_cost_to_partition_a_binary_strin(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count