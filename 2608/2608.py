class Solution:
    def shortest_cycle_in_a_graph(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]