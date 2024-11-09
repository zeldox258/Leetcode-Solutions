class Solution:
    def minimum_weighted_subgraph_with_the_requi(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]