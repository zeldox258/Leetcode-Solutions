class Solution:
    def binary_tree_longest_consecutive_sequence(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]