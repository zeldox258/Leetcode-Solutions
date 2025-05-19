class Solution:
    def absolute_difference_between_maximum_and_(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count