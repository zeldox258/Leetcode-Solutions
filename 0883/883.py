class Solution:
    def projection_area_of_3d_shapes(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]