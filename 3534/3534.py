class Solution:
    def path_existence_queries_in_a_graph_ii(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count