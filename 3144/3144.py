class Solution:
    def minimum_substring_partition_of_equal_cha(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count