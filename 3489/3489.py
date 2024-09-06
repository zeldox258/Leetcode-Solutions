class Solution:
    def zero_array_transformation_iv(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count