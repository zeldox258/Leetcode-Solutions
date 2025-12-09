class Solution:
    def number_of_substrings_with_only_1s(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]