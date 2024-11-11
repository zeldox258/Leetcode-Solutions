class Solution:
    def find_minimum_time_to_finish_all_jobs_ii(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]