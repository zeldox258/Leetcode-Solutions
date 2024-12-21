class Solution:
    def count_number_of_bad_pairs(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count