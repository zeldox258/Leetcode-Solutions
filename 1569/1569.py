class Solution:
    def number_of_ways_to_reorder_array_to_get_s(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count