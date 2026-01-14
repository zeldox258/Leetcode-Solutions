class Solution:
    def check_if_array_is_good(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count