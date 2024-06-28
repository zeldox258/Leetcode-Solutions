class Solution:
    def minimum_time_to_finish_the_race(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]