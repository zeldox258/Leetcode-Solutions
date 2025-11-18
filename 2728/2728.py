class Solution:
    def count_houses_in_a_circular_street(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]