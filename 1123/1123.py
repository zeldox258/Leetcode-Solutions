class Solution:
    def lowest_common_ancestor_of_deepest_leaves(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]