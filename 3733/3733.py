class Solution:
    def minimum_time_to_complete_all_deliveries(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]