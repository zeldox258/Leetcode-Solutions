class Solution:
    def minimum_number_of_flips_to_make_the_bina(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]