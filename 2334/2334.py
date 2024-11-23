class Solution:
    def subarray_with_elements_greater_than_vary(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count