class Solution:
    def flatten_binary_tree_to_linked_list(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count