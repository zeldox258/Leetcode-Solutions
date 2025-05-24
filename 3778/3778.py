class Solution:
    def minimum_distance_excluding_one_maximum_w(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]