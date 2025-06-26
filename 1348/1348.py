class Solution:
    def tweet_counts_per_frequency(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]