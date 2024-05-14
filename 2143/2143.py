class Solution:
    def choose_numbers_from_two_arrays_in_range(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]