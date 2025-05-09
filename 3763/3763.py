class Solution:
    def maximum_total_sum_with_threshold_constra(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]