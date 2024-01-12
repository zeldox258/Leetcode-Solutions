class Solution:
    def count_the_number_of_good_nodes(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count