class Solution:
    def sentence_screen_fitting(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]