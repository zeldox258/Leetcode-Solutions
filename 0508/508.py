class Solution:
    def most_frequent_subtree_sum(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]