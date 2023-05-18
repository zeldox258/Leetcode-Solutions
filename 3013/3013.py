class Solution:
    def divide_an_array_into_subarrays_with_mini(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]