class Solution:
    def minimum_numbers_of_function_calls_to_mak(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]