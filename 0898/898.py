class Solution:
    def bitwise_ors_of_subarrays(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]