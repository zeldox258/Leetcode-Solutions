class Solution:
    def maximum_number_of_robots_within_budget(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]