class Solution:
    def reachable_nodes_with_restrictions(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]