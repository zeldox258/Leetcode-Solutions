class Solution:
    def find_score_of_an_array_after_marking_all(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]