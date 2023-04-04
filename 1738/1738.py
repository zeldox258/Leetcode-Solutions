class Solution:
    def find_kth_largest_xor_coordinate_value(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]