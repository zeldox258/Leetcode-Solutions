class Solution:
    def maximum_average_subarray_i(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]