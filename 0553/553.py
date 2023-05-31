class Solution:
    def optimal_division(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]