class Solution:
    def minimum_increment_operations_to_make_arr(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count