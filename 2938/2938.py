class Solution:
    def separate_black_and_white_balls(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]