class Solution:
    def remove_kbalanced_substrings(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]