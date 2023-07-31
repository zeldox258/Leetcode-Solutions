class Solution:
    def shortest_distance_in_a_line(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]