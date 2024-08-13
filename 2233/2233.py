class Solution:
    def maximum_product_after_k_increments(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]