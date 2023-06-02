class Solution:
    def maximum_number_of_consecutive_values_you(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]