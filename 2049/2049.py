class Solution:
    def count_nodes_with_the_highest_score(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count