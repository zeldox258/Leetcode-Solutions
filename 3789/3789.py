class Solution:
    def minimum_cost_to_acquire_required_items(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count