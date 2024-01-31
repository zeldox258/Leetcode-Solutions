class Solution:
    def preimage_size_of_factorial_zeroes_functi(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]