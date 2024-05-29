class Solution:
    def amount_of_new_area_painted_each_day(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]