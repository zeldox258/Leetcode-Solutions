class Solution:
    def kth_largest_element_in_a_stream(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]