class Solution:
    def palindrome_rearrangement_queries(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]