class Solution:
    def maximum_length_of_semidecreasing_subarra(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]