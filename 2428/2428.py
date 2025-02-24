class Solution:
    def maximum_sum_of_an_hourglass(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]