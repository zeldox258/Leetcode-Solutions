class Solution:
    def minimum_flips_to_make_a_or_b_equal_to_c(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]