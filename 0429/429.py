class Solution:
    def nary_tree_level_order_traversal(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count