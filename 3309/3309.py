class Solution:
    def maximum_possible_number_by_binary_concat(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count