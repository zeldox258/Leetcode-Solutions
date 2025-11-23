class Solution:
    def number_of_subsequences_that_satisfy_the_(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]