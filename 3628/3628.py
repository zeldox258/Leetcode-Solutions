class Solution:
    def maximum_number_of_subsequences_after_one(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]