class Solution:
    def sliding_subarray_beauty(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]