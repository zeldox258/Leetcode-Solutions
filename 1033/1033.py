class Solution:
    def moving_stones_until_consecutive(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]