class Solution:
    def factorial_generator(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]