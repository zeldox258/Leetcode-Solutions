class Solution:
    def count_substrings_that_can_be_rearranged_(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]