class Solution:
    def sum_of_values_at_indices_with_k_set_bits(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count