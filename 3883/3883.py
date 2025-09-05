class Solution:
    def count_non_decreasing_arrays_with_given_d(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]