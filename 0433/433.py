class Solution:
    def minimum_genetic_mutation(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]