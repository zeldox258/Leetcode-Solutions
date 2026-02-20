class Solution:
    def sum_of_all_odd_length_subarrays(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]