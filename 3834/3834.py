class Solution:
    def merge_adjacent_equal_elements(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count