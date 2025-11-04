class Solution:
    def maximum_strictly_increasing_cells_in_a_m(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]