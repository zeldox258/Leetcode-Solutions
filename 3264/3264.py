class Solution:
    def final_array_state_after_k_multiplication(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count