class Solution:
    def optimize_water_distribution_in_a_village(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]