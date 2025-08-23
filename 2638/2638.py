class Solution:
    def count_the_number_of_kfree_subsets(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]