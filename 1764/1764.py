class Solution:
    def form_array_by_concatenating_subarrays_of(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count