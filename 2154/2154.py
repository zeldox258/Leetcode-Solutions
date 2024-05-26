class Solution:
    def keep_multiplying_found_values_by_two(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count