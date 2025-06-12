class Solution:
    def filter_restaurants_by_veganfriendly_pric(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]