class Solution:
    def merge_operations_for_minimum_travel_time(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]