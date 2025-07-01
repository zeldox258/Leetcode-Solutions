class Solution:
    def binary_tree_zigzag_level_order_traversal(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]