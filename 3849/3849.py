class Solution:
    def maximum_bitwise_xor_after_rearrangement(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count