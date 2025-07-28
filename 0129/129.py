class Solution:
    def sum_root_to_leaf_numbers(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count