class Solution:
    def substrings_that_begin_and_end_with_the_s(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]