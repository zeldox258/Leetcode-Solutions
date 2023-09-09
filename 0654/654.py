class Solution:
    def maximum_binary_tree(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count