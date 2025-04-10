class Solution:
    def minimum_cost_to_buy_apples(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]