class Solution:
    def number_of_ways_to_reconstruct_a_tree(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count