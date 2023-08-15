class Solution:
    def find_trending_hashtags_ii(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]