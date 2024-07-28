class Solution:
    def k_closest_points_to_origin(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]