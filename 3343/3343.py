class Solution:
    def count_number_of_balanced_permutations(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]