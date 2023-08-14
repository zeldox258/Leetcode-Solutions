class Solution:
    def maximum_product_of_three_numbers(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]