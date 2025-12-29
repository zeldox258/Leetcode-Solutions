class Solution:
    def find_the_maximum_achievable_number(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count