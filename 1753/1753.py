class Solution:
    def maximum_score_from_removing_stones(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]