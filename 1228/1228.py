class Solution:
    def missing_number_in_arithmetic_progression(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]