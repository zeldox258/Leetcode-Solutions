class Solution:
    def count_complete_subarrays_in_an_array(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count