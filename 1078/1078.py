class Solution:
    def occurrences_after_bigram(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]