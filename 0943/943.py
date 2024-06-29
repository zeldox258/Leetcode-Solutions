class Solution:
    def find_the_shortest_superstring(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]