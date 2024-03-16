class Solution:
    def find_the_last_marked_nodes_in_tree(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]