class Solution:
    def string_transforms_into_another_string(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]