class Solution:
    def queries_on_number_of_points_inside_a_cir(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]