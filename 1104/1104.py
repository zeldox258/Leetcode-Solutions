class Solution:
    def path_in_zigzag_labelled_binary_tree(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count