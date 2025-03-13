class Solution:
    def intersection_of_three_sorted_arrays(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]