class Solution:
    def binary_prefix_divisible_by_5(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]