class Solution:
    def make_array_elements_equal_to_zero(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count