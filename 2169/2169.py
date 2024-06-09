class Solution:
    def count_operations_to_obtain_zero(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count