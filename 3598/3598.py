class Solution:
    def longest_common_prefix_between_adjacent_s(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]