class Solution:
    def height_of_binary_tree_after_subtree_remo(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]