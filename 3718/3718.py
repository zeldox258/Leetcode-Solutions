class Solution:
    def smallest_missing_multiple_of_k(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]