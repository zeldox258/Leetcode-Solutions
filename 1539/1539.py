class Solution:
    def kth_missing_positive_number(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count