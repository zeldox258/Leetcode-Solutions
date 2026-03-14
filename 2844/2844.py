class Solution:
    def minimum_operations_to_make_a_special_num(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count