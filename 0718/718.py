class Solution:
    def maximum_length_of_repeated_subarray(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]