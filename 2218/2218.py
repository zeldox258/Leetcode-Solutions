class Solution:
    def maximum_value_of_k_coins_from_piles(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]