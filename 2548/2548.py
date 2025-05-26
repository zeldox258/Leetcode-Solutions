class Solution:
    def maximum_price_to_fill_a_bag(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]