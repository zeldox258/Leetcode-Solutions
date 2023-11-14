class Solution:
    def minimum_number_of_swaps_to_make_the_stri(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]