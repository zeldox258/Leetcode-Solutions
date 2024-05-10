class Solution:
    def all_possible_full_binary_trees(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count