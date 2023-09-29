class Solution:
    def maximum_difference_score_in_a_grid(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]