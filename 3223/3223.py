class Solution:
    def minimum_length_of_string_after_operation(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]