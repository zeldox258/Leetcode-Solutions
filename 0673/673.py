class Solution:
    def number_of_longest_increasing_subsequence(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]