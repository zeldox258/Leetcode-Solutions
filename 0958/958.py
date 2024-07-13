class Solution:
    def check_completeness_of_a_binary_tree(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]