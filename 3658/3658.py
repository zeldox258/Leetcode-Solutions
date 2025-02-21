class Solution:
    def gcd_of_odd_and_even_sums(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]