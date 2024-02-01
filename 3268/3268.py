class Solution:
    def find_overlapping_shifts_ii(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]