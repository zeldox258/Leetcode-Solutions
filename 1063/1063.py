class Solution:
    def number_of_valid_subarrays(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]