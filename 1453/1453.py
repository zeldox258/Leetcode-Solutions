class Solution:
    def maximum_number_of_darts_inside_of_a_circ(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]