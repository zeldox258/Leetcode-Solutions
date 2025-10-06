class Solution:
    def neighboring_bitwise_xor(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]