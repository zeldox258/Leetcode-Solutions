class Solution:
    def minimum_number_of_frogs_croaking(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count