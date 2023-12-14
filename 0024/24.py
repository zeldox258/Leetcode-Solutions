class Solution:
    def swap_nodes_in_pairs(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count