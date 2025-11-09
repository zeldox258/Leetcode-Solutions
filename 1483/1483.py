class Solution:
    def kth_ancestor_of_a_tree_node(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]