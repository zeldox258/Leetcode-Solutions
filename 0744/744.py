class Solution:
    def find_smallest_letter_greater_than_target(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count