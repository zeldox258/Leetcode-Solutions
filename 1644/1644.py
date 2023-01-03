class Solution:
    def lowest_common_ancestor_of_a_binary_tree_(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count