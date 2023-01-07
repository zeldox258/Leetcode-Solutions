class Solution:
    def sell_diminishingvalued_colored_balls(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]