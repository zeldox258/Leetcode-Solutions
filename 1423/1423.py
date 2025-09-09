class Solution:
    def maximum_points_you_can_obtain_from_cards(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]