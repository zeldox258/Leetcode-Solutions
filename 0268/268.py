class Solution:
    def missing_number(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]