class Solution:
    def maximum_total_area_occupied_by_pistons(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count