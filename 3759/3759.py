class Solution:
    def count_elements_with_at_least_k_greater_v(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count