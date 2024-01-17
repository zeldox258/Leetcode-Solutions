class Solution:
    def construct_string_with_minimum_cost_easy(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]