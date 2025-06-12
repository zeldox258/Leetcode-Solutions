class Solution:
    def largest_rectangle_in_histogram(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count