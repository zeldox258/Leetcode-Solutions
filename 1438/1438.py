class Solution:
    def longest_continuous_subarray_with_absolut(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]