class Solution:
    def count_subarrays_with_median_k(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]