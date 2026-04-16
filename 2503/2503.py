class Solution:
    def maximum_number_of_points_from_grid_queri(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]