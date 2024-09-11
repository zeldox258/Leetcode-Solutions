class Solution:
    def make_array_nondecreasing_or_nonincreasin(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]