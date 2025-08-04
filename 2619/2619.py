class Solution:
    def array_prototype_last(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count