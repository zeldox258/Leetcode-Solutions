class Solution:
    def convert_bst_to_greater_tree(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]