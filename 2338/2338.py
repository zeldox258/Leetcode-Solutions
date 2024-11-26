class Solution:
    def count_the_number_of_ideal_arrays(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]