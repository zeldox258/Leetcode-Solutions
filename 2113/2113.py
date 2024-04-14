class Solution:
    def elements_in_array_after_removing_and_rep(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]