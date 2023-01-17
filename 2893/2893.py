class Solution:
    def calculate_orders_within_each_interval(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]