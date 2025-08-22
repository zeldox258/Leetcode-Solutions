class Solution:
    def minimum_cost_to_equalize_arrays_using_sw(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]