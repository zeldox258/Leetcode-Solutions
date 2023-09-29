class Solution:
    def kth_smallest_subarray_sum(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]