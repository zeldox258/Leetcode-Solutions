class Solution:
    def maximum_value_of_an_ordered_triplet_ii(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count