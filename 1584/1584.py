class Solution:
    def min_cost_to_connect_all_points(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count