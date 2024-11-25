class Solution:
    def minimum_moves_to_clean_the_classroom(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]