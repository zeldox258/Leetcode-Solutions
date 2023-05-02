class Solution:
    def minimum_number_of_operations_to_make_x_a(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]